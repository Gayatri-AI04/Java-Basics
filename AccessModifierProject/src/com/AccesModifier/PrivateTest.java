package com.AccesModifier;

public class PrivateTest {

	//private access modifier
	//Scope :- within class only
	//used :- before variable, before method, before Constructor
	
	 int i = 390;
	 String name = "Gayatri";    //variables
	
	
	private PrivateTest() {
		
		System.out.println("--private constructor--");  //Constructor
	}
	
	private void m1() {
		
		System.out.println("--My Private Method---");  //Method
	}
	
	public static void main(String[] args) {
		
		PrivateTest pt = new PrivateTest();  //Accessing within same class
		System.out.println(pt.i);
		System.out.println(pt.name);
		pt.m1();	
	}
}
