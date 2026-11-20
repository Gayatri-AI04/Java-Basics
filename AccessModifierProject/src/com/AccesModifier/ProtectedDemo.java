package com.AccesModifier;

import com.Protected.ProtectedTest;

public class ProtectedDemo extends ProtectedTest{
	
	
	public static void main(String[] args) {
		ProtectedDemo pd = new ProtectedDemo();
		System.out.println(pd.a);
		System.out.println(pd.name);
		pd.name();
		
		ProtectedTest p = new ProtectedTest();
		ProtectedTest.main(null);
		
	}
}