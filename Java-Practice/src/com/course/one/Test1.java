package com.course.one;

public class Test1 {
	/**
	 * 		1.定义价格和数量
	 * 		2.输出袜子的总价
	 */
	public static void main(String[] args) {
		int price = 50;
		int count = 120;
		System.out.println("总价格是：" + calcuPrice(price,count));
	}
	/**
	 * @param price 价格
	 * @param count 统计
	 */
	public static int calcuPrice(int price, int count) {
		return price*count;
	}
}
