package com.javalec.robotex;

import com.javalec.robotex.inter.FlyYes;
import com.javalec.robotex.inter.KnifeWood;
import com.javalec.robotex.inter.MisailYes;

public class StandardRobot extends Robot {

	public StandardRobot() {
		// TODO Auto-generated constructor stub
		fly = new FlyYes();
		misail = new MisailYes();
		knife = new KnifeWood();
	}

	@Override
	public void shape() {
		// TODO Auto-generated method stub
		System.out.println("StandardRobot �Դϴ�. ��, �ٸ�, ����, �Ӹ��� �ֽ��ϴ�.");
	}

}
