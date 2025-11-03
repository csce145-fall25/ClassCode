package Threads;

public class ArrayInit implements Runnable {
	private int[] arr;
	private int index;
	private int count;
	
	public ArrayInit(int[] arr, int index, int count) {
		this.arr = arr;
		this.index = index;
		this.count = count;
	}
	
	@Override
	public void run() {
		String id = "Thread at index "+index;
		System.out.println(id+ " Started");
		int stop = index+count-1;
		for(int i = index;i<=stop;++i) {
			busyWork();
			arr[i]=i;
		}
		System.out.println(id+ " Finished");
	
	}
	
	
//	private static int busyIterations = 100000000;
	private static void busyWork() {
//		for(int i =0;i<busyIterations;++i);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		final int size = 400;
		int[] arr = new int[size];
		long start = System.nanoTime();
		for(int i =0; i<size;++i) {
			busyWork();
			arr[i]=i;
		}
		long end = System.nanoTime();
		long timeSingle = (end-start);
		System.out.println("One loop: it took "+ timeSingle +" ns" );
		
		
		int[] arr2 = new int[size];
		
		final int n_threads = 4;
		final Thread[] threads = new Thread[n_threads];
		start = System.nanoTime();
		final int count = size/n_threads;
		for(int i = 0;i<n_threads;++i) {
			threads[i] = new Thread(new ArrayInit(arr2,i*count,count));
			threads[i].start();
		}
		for(Thread t: threads) {
			try {
				t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		end = System.nanoTime();
		long timeThreads = (end-start);
		System.out.println("Threaded: it took "+ timeThreads +" ns" );
		
		boolean bothSame = true;
		for(int i =0; i<size;++i) {
			bothSame = arr[i]==arr2[i];
			if(!bothSame) {
				System.out.println("not same at index "+i);
				break;
			}
		}
		System.out.println(bothSame?"Both output arrays same": "Some error!");
		System.out.println("Basic speedup of threaded"+
				(double)timeSingle/timeThreads);
		
		
		
	}
	
}
