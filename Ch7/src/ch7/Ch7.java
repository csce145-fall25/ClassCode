package ch7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ch7 {
	private static Scanner sin;
	
	public static void main(String[] args) {
		//command line arguments
		System.out.println("There were "+args.length+" arguments to the command");
		System.out.println("They are");
		for(int i = 0; i<args.length; ++i) {
			System.out.println(args[i]+" of type "+args[i].getClass().getName());
		}
		System.out.println();
		
		sin = new Scanner(System.in);
//		runTempAverager();
		
//		SalesReporter sr = new SalesReporter();
//		
//		sr.getData(sin);
//		sr.computeStats();
//		sr.displayResults();
		
//		equalsSim();
//		
//		String[] list = listDemo();
//		System.out.println("The list contains:");
//		for(int i = 0; i<list.length;++i) {
//			System.out.println(list[i]);
//		}
//
//		ArrayList<String> arrayList = arrayListDemo();
//		for(int i = 0; i<arrayList.size();++i) {
//			System.out.println(arrayList.get(i));
//		}
		
//		String[] noRepeatList = oneWayNoRepeatsDemo();
//		System.out.println("The list contains:");
//		for(int i = 0; i<noRepeatList.length;++i) {
//			System.out.println(noRepeatList[i]);
//		}
		
//		int[] ns = {4,1,3,9,6,0,2,7,5,8};
//		int[] ms = ns.clone();
//		printIntArray(ns);
//		selectionSort(ns);
//		printIntArray(ns);
//		System.out.println("-----");
//		printIntArray(ms);
//		int[] result = selectionSort(ms,false);
//		printIntArray(ms);
//		printIntArray(result);
		
		printInterestTable();
		
		String[][] cards = new String [2][];
		cards[0] = new String[2];
		cards[0][0] = "3C";
		cards[0][1] = "6H";
		String[] p2 = {"7D","KH","QS"};
		cards[1] = p2;
		
		for(int i=0;i<cards.length; ++i) {
			for( int j=0; j<cards[i].length; ++j){
				System.out.print(cards[i][j]+" ");
			}
			System.out.println();
		}
		
		String[] p3 = {"AD","AH","AS"};
		cards[1] = p3;

		for(int i=0;i<cards.length; ++i) {
			for( int j=0; j<cards[i].length; ++j){
				System.out.print(cards[i][j]+" ");
			}
			System.out.println();
		}
		
	}

	private static void printInterestTable() {
		//double[] interests = {5.0,5.5,6.0,6.5,7.0,7.5};
		
		double base = 1000.0;
		final int years = 10;
		double[][] chart = new double[years+1][6];
		for(int i = 0;i<6;++i) {
			chart[0][i] = base;
		}
		for(int r =1;r<=years;++r) {
			for(int i=0;i<6;++i) {
				chart[r][i] = chart[r-1][i]*(1+0.05+i*0.005);
			}
		}
		
		for(int r =1;r<=years;++r) {
			for(int i=0;i<6;++i) {
				System.out.print( chart[r][i]+"\t");
			}
			System.out.println();
		}
		
	}

	private static int[] selectionSort(int[] arr, boolean makeCopy) {
		if (makeCopy) {
			arr = arr.clone();
		}
		selectionSort(arr);
		return arr;
		
	}

	private static void printIntArray(int[] xs){
		System.out.println(intArray2String(xs));
	}
	
	private static String intArray2String(int[] ns) {
		String items = "[ ";
		for(int i = 0; i<ns.length; ++i) {
			items+= ns[i];
			if(i < ns.length -1) 
				items+=", ";
		}
		items+=" ]";
		return items;
	}

	private static void selectionSort(int[] xs) {
		for(int i = 0; i<xs.length-1; ++i) {
			int min_index = i;
			for (int j = i+1; j<xs.length; ++j) {
				if(xs[j]<xs[min_index]) {
					min_index = j;
				}
			}
			int temp = xs[i];
			xs[i] = xs[min_index];
			xs[min_index] = temp;
		}
	}

	private static String[] listDemo() {//merging with return array
		String[] list = new String[3];
		System.out.println("Enter items for a list");
		for(int i = 0; i<list.length;++i) {
			System.out.println("Enter an Item");
			list[i] = sin.nextLine();
		}
		System.out.println("The list is now full");
		return list;
		
	}
	
	private static String[] oneWayNoRepeatsDemo() {//merging with return array
		String[] list = new String[3];
		System.out.println("Enter items for a list");
		for(int countOfEntries = 0; countOfEntries<list.length;++countOfEntries) {
			System.out.println("Enter an Item");
			list[countOfEntries] = sin.nextLine();
			for(int j = countOfEntries-1; j>=0;--j) {
				if(list[j].equals(list[countOfEntries])) {
					--countOfEntries;
					System.out.println("That's a duplicate, skipping");
					System.out.print("pre-skip list: [");
					for(int k = 0; k<list.length; ++k) {
						System.out.print(list[k]
								+((k==list.length-1)? "" : ", "));
					}
					System.out.println("]");
					System.out.println(list);
					break;
				}
			}
		}
		System.out.println("The list is now full");
		return list;
		
	}
	
	private static ArrayList<String> arrayListDemo() {//merging with return array
		ArrayList<String> list = new ArrayList<String>();
		System.out.println("Enter items for a list (type \"finish list\"  to finish");
		
		while(true) {
			System.out.println("Enter item");
			String in = sin.nextLine();
			if (in.equalsIgnoreCase("finish list")) {
				break;
			} else {
				list.add(in);
			}
		}
		System.out.println("The list is not full. It is never full");
		return list;
		
	}

	private static void runTempAverager() {
		System.out.println("How many temperatures do you have?");
		final int ct = sin.nextInt();
		sin.nextLine();
		System.out.println("Enter "+ ct+" temperatures");
		double temps[] = new double[ct];
		double sum = 0.0;
		for(int i = 0; i<temps.length; ++i) {
			temps[i] = sin.nextDouble();
			sin.nextLine();
			sum+=temps[i];
		}
		double average = sum/ct;
		System.out.println("The average temperature is "+average);
		System.out.println("The temperatures are");
		for(int i =0;i<ct;++i) {
			System.out.println(temps[i]+ 
					(temps[i]>average?" above average":" below average") );
		}
		System.out.println("Have a nice week.");
		
	}
	
	public static void equalsSim()
	{
		System.out.println("Equals sim");
		int[] a = {1,2,3};
		int[] b = {1,2,3};
		String[] c = {"one","two","three"};
		String[] d = {"one","two","three"};
		System.out.println("For");
		System.out.println("		int[] a = {1,2,3};\n"
				+ "		int[] b = {1,2,3};\n"
				+ "		String[] c = {\"one\",\"two\",\"three\"};\n"
				+ "		String[] d = {\"one\",\"two\",\"three\"};");
		System.out.println("a==b is " + (a==b) );
		System.out.println("a.equals(b) is " + a.equals(b));
		
		System.out.println("c==d is " + (c==d) );
		System.out.println("c.equals(d) is " + c.equals(d));
		
		System.out.println("Arrays.equals(a, b); ->"+Arrays.equals(a, b));
		System.out.println("Arrays.equals(c, d); ->"+Arrays.equals(c, d));
		
		
		
	}
	
	
	

}
