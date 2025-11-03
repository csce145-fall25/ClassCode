package com.shapes;

public class Triangle extends ShapeBase {
	private int base;
	
	public Triangle(int base) {
		this.base = base;
	}
	
	
	@Override
	public void drawHere(int offset) {
		int half = base/2;
		int side = half;
		String out = "";
		while(side>0) {
			for(int i=0; i<offset; ++i) 
				out +=" ";
			for(int i=0; i<base; ++i) 
				out += (i==side||i==base-side-1)?"*": " ";
			out+="\n";
			--side;
		}
		
		for(int i=0; i<offset; ++i) 
			out +=" ";
		for(int i=0; i<base; ++i) 
			out +="*";
		out+="\n";

		System.out.print(out);

	}

}
