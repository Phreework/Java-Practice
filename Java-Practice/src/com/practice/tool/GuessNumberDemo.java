package com.practice.tool;
import java.util.Scanner;
/*
������С��Ϸ
������
	1.ϵͳ����һ��1-100֮����������
		int number = (int)(Math.random()*100)+1;
	2.����¼������,��Scannerʵ��
	3.�����������ݽ��бȽ�
		��	��ʾ����
		С	��ʾС��
		��	��ϲ�㣬������
	4.Ϊ�˱�֤�����ܹ����У�whileѭ��ʵ�ֶ�β¡�ֱ�����С�
*/
class GuessNumberDemo {
public static void main(String[] args) {
	//ϵͳ����һ��1-100֮����������
	int number = (int)(Math.random()*100)+1;
	System.out.println(number);
	//this is a interesting structure
	while(true) {
		//����¼������,��Scannerʵ��
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ�����ݣ�(1-100)");
		int guessNumber = sc.nextInt();
		//�����������ݽ��бȽ�
		if(guessNumber > number) {
			System.out.println("��µ�����"+guessNumber+"����");
		}else if(guessNumber < number) {
			System.out.println("��µ�����"+guessNumber+"С��");
		}else {
			System.out.println("��ϲ�㣬������");
			break;
		}
	}
	
}
}