package com.javalec.Duck;

import com.javalec.Duck.inter.FlyWithWings;
import com.javalec.Duck.inter.Quack;

public class MallardDuck extends Duck {
	public MallardDuck() {
		// TODO Auto-generated constructor stub
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("청둥오리 이다.");
	}
}
