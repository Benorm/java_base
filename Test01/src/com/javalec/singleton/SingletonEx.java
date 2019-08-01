package com.javalec.singleton;

public class SingletonEx {
	
	private static SingletonEx singletonEx = new SingletonEx();
	public int a = 50000;
	
	private SingletonEx() {
		// TODO Auto-generated constructor stub
		
		System.out.println("?Éù?Ñ±");
	}
	
	public static SingletonEx getSingletonEx() {
		
		if(singletonEx == null) {
			singletonEx = new SingletonEx();
		}
		
		return singletonEx;
	}
	
}
