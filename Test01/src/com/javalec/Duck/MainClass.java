package com.javalec.Duck;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck duck01 = new MallardDuck();
		Duck duck02 = new RedHeadDuck();
		Duck duck03 = new RubberDuck();
		
		Duck[] duck = {duck01, duck02, duck03};
		
		for (int i = 0; i < duck.length; i++) {
			duck[i].display();
			duck[i].performQuack();
			duck[i].swim();
			duck[i].performFly();
			System.out.println("-------------------------");
		}
	}

}
