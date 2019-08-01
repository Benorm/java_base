package com.javalec.timertask;

import java.util.Timer;
import java.util.TimerTask;

public class TimerEx {
	
	public TimerEx() throws InterruptedException{
		// TODO Auto-generated constructor stub
		Timer timer = new Timer(true);
		TimerTask timerTask1 = new TimerTask1();
		TimerTask timerTask2 = new TimerTask2();
		
		System.out.println("작업 시작 :");
		timer.schedule(timerTask1, 3000);
		timer.schedule(timerTask2, 10000);
		
		Thread.sleep(15000);
		
	}
	
}
