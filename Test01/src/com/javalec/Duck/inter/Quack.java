package com.javalec.Duck.inter;

public class Quack implements QuackBehavior {
	public Quack() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("큰 소리로 운다.");
	}
}
