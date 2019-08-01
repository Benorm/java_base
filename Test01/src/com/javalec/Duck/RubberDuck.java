package com.javalec.Duck;

import com.javalec.Duck.inter.FlyNoWay;
import com.javalec.Duck.inter.MuteQuack;

public class RubberDuck extends Duck {

	public RubberDuck() {
		// TODO Auto-generated constructor stub
		quackBehavior = new MuteQuack();
		flyBehavior = new FlyNoWay();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("장난감 오리 이다.");
	}

}
