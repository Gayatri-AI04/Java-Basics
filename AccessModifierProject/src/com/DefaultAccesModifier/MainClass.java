package com.DefaultAccesModifier;

class MainClass {

	public static void main(String[] args) {
		
		
		//Accessing data within Same package
		
		DefaultTest d1 = new DefaultTest();  
		System.out.println(d1.a);
		System.out.println(d1.name);
		d1.m2();
		
		
	}
	
	
}
