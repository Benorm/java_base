package com.javalec.Duck.inter;

public class MuteQuack implements QuackBehavior {
	public MuteQuack() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("울지 않는다.");
	}
}
