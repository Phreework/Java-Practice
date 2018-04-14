package com.supermarket.data;

public class GoodsDao {
	static String goods[] = new String[100];
	
	static int index = 0;
	
	public void add(String s) {
		goods[index] = s;
		index ++ ;
	}
	
	public void lookAllGoods() {
		for(int i = 0;i < index; i++) {
			System.out.println(goods[i]);
			System.out.println("-------------------------");
		}
	}
}
