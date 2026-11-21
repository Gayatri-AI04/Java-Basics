package com.AccesModifier;

public class Def {

	public static void main(String[] args) {
		
		//try to accessing in Different Package
		
		Def d2 = new Def();
		
		System.out.println(d2.a);
		System.out.println(d2.name);
		
		d2.m2();
	}
}
