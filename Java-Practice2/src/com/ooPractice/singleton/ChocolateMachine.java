package com.ooPractice.singleton;
 
public class ChocolateMachine {
	private boolean empty;
	private boolean boiled;
	private static ChocolateMachine Instance;
  
	private ChocolateMachine() {
		empty = true;
		boiled = false;
	}
  
	public static ChocolateMachine getInstance() {
		if (Instance == null) {
			System.out.println("创建唯一的 咖啡机实例");
			Instance = new ChocolateMachine();
		}
		System.out.println("已创建实例，得到咖啡机实例");
		return Instance;
	}

	public void fill() {
		if (!isEmpty()) return;
			System.out.println("装满咖啡~");
			empty = false;
			boiled = false;
	}
 
	public void drain() {
		if (isEmpty() || !isBoiled()) return;
			System.out.println("咖啡排出~");
			empty = true;
	}
 
	public void boil() {
		if (isEmpty() || isBoiled()) return;
			System.out.println("咖啡煮好了！");
			boiled = true;
	}
  
	public boolean isEmpty() {
		return empty;
	}
 
	public boolean isBoiled() {
		return boiled;
	}
}
