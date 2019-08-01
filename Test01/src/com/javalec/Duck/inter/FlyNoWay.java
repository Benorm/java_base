package com.javalec.Duck.inter;

public class FlyNoWay implements FlyBehavior {
	public FlyNoWay() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("날 수 없다.");
	}
}
