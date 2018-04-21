package com.ooPractice.singleton;

public class Printer {
	private boolean empty;
	private boolean loaded;
	private volatile static Printer Instance;
  
	private Printer() {
		empty = true;
		loaded = false;
	}
  
	public static Printer getInstance() {
		if (Instance == null) {
			System.out.println("����Ψһ�Ĵ�ӡ��ʵ��");
			Instance = new Printer();
		}
		System.out.println("�Ѵ���ʵ�����õ���ӡ��ʵ��");
		return Instance;
	}

	public void fill() {
		if (!isEmpty()) return;
			System.out.println("װֽ~");
			empty = false;
			loaded = false;
	}
 
	public void drain() {
		if (isEmpty() || !isLoaded()) return;
			System.out.println("��ӡ���~");
			empty = true;
	}
 
	public void load() {
		if (isEmpty() || isLoaded()) return;
			System.out.println("��ȡ��ӡ���ݣ�");
			loaded = true;
	}
  
	public boolean isEmpty() {
		return empty;
	}
 
	public boolean isLoaded() {
		return loaded;
	}
}