package com.javalec.Duck;

import com.javalec.Duck.inter.FlyBehavior;
import com.javalec.Duck.inter.QuackBehavior;

public abstract class Duck {
	
	QuackBehavior quackBehavior;
	FlyBehavior flyBehavior;
	
	public Duck() {
		// TODO Auto-generated constructor stub
	}
	
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("수영할 수 있다.");
	}

	public void performQuack() {
		// TODO Auto-generated method stub
		quackBehavior.quack();
	}
	
	public void performFly() {
		// TODO Auto-generated method stub
		flyBehavior.fly();
	}

	public abstract void display();

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	
	
}
