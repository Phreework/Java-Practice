package com.ooPractice.singleton;
 
public class ChocolateController {
	public static void main(String args[]) {
		ChocolateMachine boiler = ChocolateMachine.getInstance();
		boiler.fill();
		boiler.boil();
		boiler.drain();

		//若未显示创建，则返回实例相同
		ChocolateMachine boiler2 = ChocolateMachine.getInstance();
	}
}
