package com.DataTypes;

public class DataTypeDefaultValues {

	byte age;      //0
	short std;    //0
	int PIN;      //0
	long AadharNo;    //0
	
	float percentage;   //0.0
	double salary;      //0.0
	
	boolean isValid;    //false
	
	char division;      // '/u0000'
	
	String adress;     //null
	
	public static void main(String[] args) {
		
		DataTypeDefaultValues data1 = new DataTypeDefaultValues();
		
		System.out.println(data1.age);
		System.out.println(data1.std);
		System.out.println(data1.PIN);
		System.out.println(data1.AadharNo);
		System.out.println(data1.percentage);
		System.out.println(data1.salary);
		System.out.println(data1.isValid);
		System.out.println(data1.division);
		System.out.println(data1.adress);
		
	}
}
