package com.AccesModifier;

import com.PublicAccessModifier.PublicTest;

public class PublicMain {

	//Accessing outside package
	
	public static void main(String[] args) {
		
		PublicTest p1 = new PublicTest();
		System.out.println(p1.num);
		System.out.println(p1.Adress);
		System.out.println(p1.mbNo);
		
		p1.m1();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
