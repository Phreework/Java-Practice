package com.course.two;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("请输入一个数字：");
		int a = sc.nextInt();
		System.out.println("请输入第二个数字：");
		int b = sc.nextInt();
		System.out.println("请输入一个符号：");
		String symbol = sc.next();
		
		int result = 0;
		switch (symbol) {
		case "+":
			result = a + b;
			break;
		case "-":
			result = a - b;
			break;
		case "*":
			result = a * b;
			break;
		case "/":
			result = a / b;
			break;
		default:
			System.out.println("输入错误");
		}

		System.out.println("计算结果是：" + result);
	}
}
