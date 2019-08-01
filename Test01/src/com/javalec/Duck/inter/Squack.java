package com.javalec.Duck.inter;

public class Squack implements QuackBehavior {
	public Squack() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("작은 소리로 운다.");
	}
}
