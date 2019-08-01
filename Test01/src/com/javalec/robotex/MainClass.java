package com.javalec.robotex;

import com.javalec.robotex.inter.FlyNo;
import com.javalec.robotex.inter.FlyYes;
import com.javalec.robotex.inter.KnifeLazer;
import com.javalec.robotex.inter.MisailYes;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("SuperRobot 만들어주세요.");
		Robot superRobot = new SuperRobot();
		superRobot.shape();
		superRobot.actionwalk();
		superRobot.actionRun();
		
//		superRobot.setFly(new FlyYes());
		superRobot.actionFly();
		
//		superRobot.setMisail(new MisailYes());
		superRobot.actionMisail();
		
//		superRobot.setKnife(new KnifeLazer());
		superRobot.actionKnife();
		
		superRobot.setFly(new FlyNo());
		superRobot.actionFly();
		
	}
	
}
