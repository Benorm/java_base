package com.javalec.robotex;

import com.javalec.robotex.inter.IFly;
import com.javalec.robotex.inter.IKnife;
import com.javalec.robotex.inter.IMisail;

public abstract class Robot {

	IFly fly;
	IMisail misail;
	IKnife knife;

	public Robot() {
		// TODO Auto-generated constructor stub
	}

	public void actionwalk() {
		System.out.println("���� �� �ֽ��ϴ�.");
	}

	public void actionRun() {
		System.out.println("�޸� �� �ֽ��ϴ�.");
	}

	public abstract void shape();

	public void setFly(IFly fly) {
		this.fly = fly;
	}

	public void setMisail(IMisail misail) {
		this.misail = misail;
	}

	public void setKnife(IKnife knife) {
		this.knife = knife;
	}

	public void actionKnife() {
		// TODO Auto-generated method stub
		this.knife.knife();
	}

	public void actionMisail() {
		// TODO Auto-generated method stub
		this.misail.misail();
	}

	public void actionFly() {
		// TODO Auto-generated method stub
		this.fly.fly();
	}

}
