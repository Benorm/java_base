package com.javalec.hashset;

public class Student {
	String name;
	int grade;
	
	public Student(String name, int grade) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.grade = grade;
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " : " + grade;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		String compareValue = obj.toString();
		String thisValue = toString();
		
//		System.out.println(compareValue);
//		System.out.println(thisValue);
		
		return thisValue.equals(compareValue);
		
		
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
//		System.out.println(toString());
//		System.out.println(toString().hashCode());
//		System.out.println(super.hashCode());
		return toString().hashCode();
	}
	
}
