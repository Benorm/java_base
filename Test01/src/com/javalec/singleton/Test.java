package com.javalec.singleton;

public class Test {
	SingletonEx singletonEx = SingletonEx.getSingletonEx();
	
	public void test() {
		singletonEx.a = 3000;
	}
	
}