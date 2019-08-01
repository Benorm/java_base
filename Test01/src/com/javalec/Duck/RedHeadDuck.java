package com.javalec.Duck;

import com.javalec.Duck.inter.FlyWithWings;
import com.javalec.Duck.inter.Squack;

public class RedHeadDuck extends Duck {
	public RedHeadDuck() {
		// TODO Auto-generated constructor stub
		quackBehavior = new Squack();
		flyBehavior = new FlyWithWings();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("빨간머리 오리 이다.");
	}
}
