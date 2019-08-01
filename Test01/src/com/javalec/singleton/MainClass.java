package com.javalec.singleton;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SingletonEx singletonEx = SingletonEx.getSingletonEx();
		System.out.println(singletonEx.a);
		Test test = new Test();
		test.test();
		System.out.println(singletonEx.a);
	}

}
