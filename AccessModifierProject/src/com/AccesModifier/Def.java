package com.AccesModifier;

public class Def {

	public static void main(String[] args) {
		
		//try to accessing in Different Package
		
		DefaultTest d2 = new DefaltTest();
		
		System.out.println(d2.a);
		System.out.println(d2.name);
		
		d2.m2();
	}
}
