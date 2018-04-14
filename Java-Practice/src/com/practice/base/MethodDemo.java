package com.practice.base;
import java.util.Scanner;
class MethodTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//获取键盘录入数据
		System.out.println("请输入第一个数据：");
		int a = sc.nextInt();
		System.out.println("请输入第二个数据：");
		int b = sc.nextInt();

		//调用方法
		int max = getMax(a,b);
		System.out.println("较大的值是："+max);
	}
	/**
	 * @param a 一个数
	 * @param b 另一个数
	*/
	public static int getMax(int a,int b) {
		return a>b?a:b;
	}
}

