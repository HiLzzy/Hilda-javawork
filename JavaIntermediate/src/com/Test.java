package com;

public class Test {
	public static void main(String[] args) {
		Sample obj=new Sample();
		obj.getOne();
		obj.getTwo();
		obj.getFinal();
		
		obj.getOne().getTwo().getFinal();
	}

}
