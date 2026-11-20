package com.PublicAccessModifier;

public class PublicTest {                  //class
	
	//Public access modifier
	//scope :- within class, same package
	           // Outside Package.
	//Used before :- class, variable, method, Constructor

	public int num = 384;
	public String Adress = "PCMC";       //variables
	public long mbNo = 74898745940l;
	
	
	public PublicTest() {                //Constructor
		System.out.println("---Public Default Constructor----");
	}
	
	public void m1() {                   //method
		System.out.println("--Public m1 method---");
	}
	
	public static void main(String[] args) {
		
		PublicTest pb = new PublicTest();      //accessing within same class
		System.out.println(pb.num);
		System.out.println(pb.Adress);
		System.out.println(pb.mbNo);
		pb.m1();
		
	}
	
	
}
