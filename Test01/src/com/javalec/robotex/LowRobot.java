package com.javalec.robotex;

import com.javalec.robotex.inter.FlyNo;
import com.javalec.robotex.inter.KnifeNo;
import com.javalec.robotex.inter.MisailNo;

public class LowRobot extends Robot {

	public LowRobot() {
		// TODO Auto-generated constructor stub
		fly = new FlyNo();
		misail = new MisailNo();
		knife = new KnifeNo();
	}

	@Override
	public void shape() {
		// TODO Auto-generated method stub
		System.out.println("LowRobot 입니다. 팔, 다리, 몸통, 머리가 있습니다.");
	}
}
