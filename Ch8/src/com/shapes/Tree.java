package com.shapes;

public class Tree extends ShapeBase {
	private Rectangle trunk;
	private Triangle leaves;
	private int rectOffset;
	
	public Tree( int width) {
		this.leaves = new Triangle(width);
		this.rectOffset = (int) (0.4*width);
		this.trunk = new Rectangle((int)(0.3*width), (int)(0.2*width));
	}
	@Override
	public void drawHere(int offset) {
		leaves.drawHere(offset);
		trunk.drawHere(offset+rectOffset);

	}

}
