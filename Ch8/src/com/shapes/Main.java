package com.shapes;

public class Main {
	public static void main(String[] args) {
		ShapeBase rect = new Rectangle(13,5);
//		drawTwice(rect);
		
		rect.drawAt(4);
		
		ShapeBase triangle = new Triangle(15);
		triangle.drawAt(6);
		
		ShapeBase tree = new Tree(24);
		tree.drawAt(12);
//		
//		ShapeBase[] shapes = {rect,triangle,tree};
//		
//		for(ShapeBase sb : shapes) {
//			sb.drawAt(12);
//		}
	}
	
	public static void drawTwice(ShapeInterface si) {
		si.drawAt(10);
		si.drawAt(6);
	}
}
