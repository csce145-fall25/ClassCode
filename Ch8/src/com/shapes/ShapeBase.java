package com.shapes;

public abstract class ShapeBase implements ShapeInterface{

	@Override
	public void drawAt(int offset) {
		drawHere(offset);
		
	}

	
	public abstract void drawHere(int offset);

}
