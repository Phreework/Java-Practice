package com.practice.base;

/*
static:静态关键字。

作用：
	可以修饰成员变量和成员方法
特点：
	1.随着类的加载而加载	
	2.优先于对象存在
	3.被类的所有对象共享
		这也是我们判断是否使用静态关键字的条件
	4.可以通过类名调用
		我们的调用既可以是对象，还可以是类名
*/
class ShowSth {
	public void show() {
		System.out.println("show");
	}

	public static void show2() {
		System.out.println("show2");
	}
}

class StaticDemo {
	public static void main(String[] args) {
		ShowSth s = new ShowSth();
		s.show();
		s.show2();

		ShowSth.show2();
	}
}
