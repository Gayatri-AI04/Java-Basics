package com.Protected;

public class ProtectedTest {

	protected int a;
	protected String name= "Gayuu";
	
	protected void name() {
		System.out.println("---Protected method of ProtectedTest---");

}
	
	public static void main(String[] args) {
		
		ProtectedTest pt = new ProtectedTest();
		System.out.println(pt.a);
	}
}
