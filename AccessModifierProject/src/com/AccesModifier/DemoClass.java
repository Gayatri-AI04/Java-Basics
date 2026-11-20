package com.AccesModifier;

public class DemoClass {

	
	PrivateTest p = new PrivateTest(); //restrict to object creation
	                                    //becoz constructor is private
	
	System.out.println(p.i);
	System.out.println(p.i);       //not accessed variables
	
	p.m1();                   //not accessed method also
}
