package com.shapes;

public class Rectangle extends ShapeBase {
	private int width;
	private int height;
	
	public Rectangle(int w, int h) {
		setWidth(w);
		height=h;
	}
	
	@Override
	public void drawHere(int offset) {
		drawHorizontalLine(offset);
		drawVerticalLines(offset);
		drawHorizontalLine(offset);

	}
	
	private void drawHorizontalLine(int offset) {
		String out = "";
		for(int i=0; i<offset; ++i) 
			out +=" ";
		for(int i=0; i<width; ++i) 
			out +="-";
		out+="\n";
		System.out.print(out);
	}
	
	private void drawVerticalLines(int offset) {
		String out = "";
		for(int j=0;j<height-2;++j) {
			for(int i=0; i<offset; ++i) 
				out +=" ";
			for(int i=0; i<width; ++i) 
				out += (i==0||i==width-1)?"|": " ";
			out+="\n";
		}
		System.out.print(out);
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	

}
