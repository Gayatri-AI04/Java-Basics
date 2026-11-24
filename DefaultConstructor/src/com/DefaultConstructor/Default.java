package com.DefaultConstructor;

public class Default {

	int eId = 7623;
	String eName = "Manasi kamble";
	String eAddress = "Pune";

	public void m1() {
		Default d = new Default();
		System.out.println(d.eId);
		System.out.println(d.eName);
		System.out.println(d.eAddress);

	}

	public static void main(String[] args) {

		Default d1 = new Default();
		
		d1.m1();
	}
}
