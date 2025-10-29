package ch5;

public class Rectangle2 {
	private Rectangle rect;
	
	public Rectangle2() {
		rect = new Rectangle(2,2);
	}
	
	void setDimensions(int width, int height) {
		rect.setHeight(height);
		rect.setWidth(width);
	}
	
	public int getWidth() {
		return rect.getWidth();
	}
	
	public int getHeight() {
		return rect.getHeight();
	}
	
	public int getArea() {
		return rect.getArea();
	}
	
}
