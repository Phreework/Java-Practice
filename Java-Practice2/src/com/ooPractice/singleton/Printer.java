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
			System.out.println("创建唯一的打印机实例");
			Instance = new Printer();
		}
		System.out.println("已创建实例，得到打印机实例");
		return Instance;
	}

	public void fill() {
		if (!isEmpty()) return;
			System.out.println("装纸~");
			empty = false;
			loaded = false;
	}
 
	public void drain() {
		if (isEmpty() || !isLoaded()) return;
			System.out.println("打印完成~");
			empty = true;
	}
 
	public void load() {
		if (isEmpty() || isLoaded()) return;
			System.out.println("读取打印内容！");
			loaded = true;
	}
  
	public boolean isEmpty() {
		return empty;
	}
 
	public boolean isLoaded() {
		return loaded;
	}
}
