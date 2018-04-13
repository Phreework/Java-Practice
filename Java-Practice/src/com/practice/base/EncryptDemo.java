package com.practice.base;
import java.util.Scanner;

/*
某个公司采用公用电话传递数据信息，数据是小于8位的整数，为了确保安全，
在传递过程中需要加密，加密规则如下：
	首先将数据倒序，然后将每位数字都加上5，再用和除以10的余数代替该数字，
	最后将第一位和最后一位数字交换。 请任意给定一个小于8位的整数，
	然后，把加密后的结果在控制台打印出来。
分析：
	A:数据是小于8位的整数
		数据是变化的。(不以0开头)
	B:加密规则
		假设数据为：123456
		首先将数据倒序
			654321
		然后将每位数字都加上5，再用和除以10的余数代替该数字
			109876
		最后将第一位和最后一位数字交换
			609871
	C:输出结果
		609871
*/
class EncryptDemo{
	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);

		//键盘录入数据
		System.out.println("请输入数据(小于8位的整数)：");
		int number = sc.nextInt();

		jiaMi(number);
	}

	public static void jiaMi(int number) {
		int[] arr = new int[8];

		//第一步
		int index = 0;

		while(number>0) {
			arr[index++] = number%10;
			number /= 10;
		}

		//第二步
		for(int x=0; x<index; x++) {
			arr[x] += 5;
			arr[x] %= 10;
		}

		//第三步
		int temp = arr[0];
		arr[0] = arr[index-1];
		arr[index-1] = temp;

		//输出
		for(int x=0; x<index; x++) {
			System.out.print(arr[x]);
		}
		System.out.println();
	}
}