package ch5;

public class Rectangle {
	private int width; 
	private int height;
	private int id;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getArea() {
		return this.getWidth()*this.getHeight();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}
