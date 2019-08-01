package com.javalec.robotex;

import com.javalec.robotex.inter.FlyYes;
import com.javalec.robotex.inter.KnifeLazer;
import com.javalec.robotex.inter.MisailYes;

public class SuperRobot extends Robot {

	public SuperRobot() {
		// TODO Auto-generated constructor stub
		fly = new FlyYes();
		misail = new MisailYes();
		knife = new KnifeLazer();
	}

	public void shape() {
		// TODO Auto-generated method stub
		System.out.println("SuperRobot 입니다. 팔, 다리, 몸통, 머리가 있습니다.");
	}
}
