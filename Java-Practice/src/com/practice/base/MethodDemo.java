package com.practice.base;
import java.util.Scanner;
class MethodTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//��ȡ����¼������
		System.out.println("�������һ�����ݣ�");
		int a = sc.nextInt();
		System.out.println("������ڶ������ݣ�");
		int b = sc.nextInt();

		//���÷���
		int max = getMax(a,b);
		System.out.println("�ϴ��ֵ�ǣ�"+max);
	}
	/**
	 * @param a һ����
	 * @param b ��һ����
	*/
	public static int getMax(int a,int b) {
		return a>b?a:b;
	}
}

