package com.course.one;

public class Test1 {
	/**
	 * 		1.����۸������
	 * 		2.������ӵ��ܼ�
	 */
	public static void main(String[] args) {
		int price = 50;
		int count = 120;
		System.out.println("�ܼ۸��ǣ�" + calcuPrice(price,count));
	}
	/**
	 * @param price �۸�
	 * @param count ͳ��
	 */
	public static int calcuPrice(int price, int count) {
		return price*count;
	}
}
