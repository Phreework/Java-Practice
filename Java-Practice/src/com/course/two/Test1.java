package com.course.two;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("������һ�����֣�");
		int a = sc.nextInt();
		System.out.println("������ڶ������֣�");
		int b = sc.nextInt();
		System.out.println("������һ�����ţ�");
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
			System.out.println("�������");
		}

		System.out.println("�������ǣ�" + result);
	}
}