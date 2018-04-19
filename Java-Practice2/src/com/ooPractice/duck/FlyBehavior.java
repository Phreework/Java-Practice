package com.ooPractice.duck;

public interface FlyBehavior {

	public void fly();

}

class FlyWithWings implements FlyBehavior{
	public void fly(){
		System.out.println("Im flying!!");
	}
}

class FlyNoWay implements FlyBehavior{
	public void fly(){
		System.out.println("I cant fly.");
	}
}

class FlyRocketPowered implements FlyBehavior{
	public void fly(){
		System.out.println("Im flying with a rocket");
	}
}

