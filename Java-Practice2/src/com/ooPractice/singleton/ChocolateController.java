package com.ooPractice.singleton;
 
public class ChocolateController {
	public static void main(String args[]) {
		ChocolateMachine boiler = ChocolateMachine.getInstance();
		boiler.fill();
		boiler.boil();
		boiler.drain();

		//��δ��ʾ�������򷵻�ʵ����ͬ
		ChocolateMachine boiler2 = ChocolateMachine.getInstance();
	}
}
