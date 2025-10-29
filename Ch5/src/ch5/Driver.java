package ch5;

public class Driver {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(3,4);
		System.out.println(r.getWidth());
		r.setWidth(20);;
		System.out.println(r.getWidth());
//		System.out.println(r.width);
		
		Rectangle s = new Square(6);
		System.out.println(s.getHeight());
	}
}
