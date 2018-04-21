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
			System.out.println("����Ψһ�� ���Ȼ�ʵ��");
			Instance = new ChocolateMachine();
		}
		System.out.println("�Ѵ���ʵ�����õ����Ȼ�ʵ��");
		return Instance;
	}

	public void fill() {
		if (!isEmpty()) return;
			System.out.println("װ������~");
			empty = false;
			boiled = false;
	}
 
	public void drain() {
		if (isEmpty() || !isBoiled()) return;
			System.out.println("�����ų�~");
			empty = true;
	}
 
	public void boil() {
		if (isEmpty() || isBoiled()) return;
			System.out.println("��������ˣ�");
			boiled = true;
	}
  
	public boolean isEmpty() {
		return empty;
	}
 
	public boolean isBoiled() {
		return boiled;
	}
}