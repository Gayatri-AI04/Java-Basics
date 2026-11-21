package com.DataTypes;

public class DataTypes {

	//Integer Group
	byte b = 57;
	short s = 8732;
	int i = 124345;
	long l = 6454390350l;
	
	//floating group
	float f = 65473.32435264f;
	double d = 4532.7463895749948784658;
	
	//Boolean Group
	boolean flag = true;
	
	//character group 
	char c = 'G';
	
	//NON PRIMITIVE Group
	String name = "Gayatri";
	
	public void m1()
	{
		System.out.println("--------------------------------");
		System.out.println("----m1 method---------");
		
		//DataTypes d = new DataTypes();
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(flag);
		System.out.println(c);
		System.out.println(name);
		
	}
	
	public static void main(String[] args) {
		
		DataTypes data = new DataTypes();
		System.out.println(data.b);
		System.out.println(data.s);
		System.out.println(data.i);
		System.out.println(data.l);
		System.out.println(data.f);
		System.out.println(data.d);
		System.out.println(data.flag);
		System.out.println(data.c);
		System.out.println(data.name);
		
		data.m1();
		
	}
	
}
