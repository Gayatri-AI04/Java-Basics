package com.DefaultAccesModifier;

class DefaultTest {               //Default class

	//Default Access modifier
	//Scope :- same class, within same package
	//used before :- class, variables, method, constructor
	
	int a=78;                    //default variables
	String name = "Kavya";
	
	DefaultTest() {
		System.out.println("--Default Constructor--");
	}
	
	void m2() {                 //Default method
		
		System.out.println("--default method---");
	}
	
	public static void main(String[] args) {
		
		DefaultTest dt = new DefaultTest();
		System.out.println(dt.a);        //accessing within same class
		System.out.println(dt.name);
		dt.m2();
	}
	
	
	
}
