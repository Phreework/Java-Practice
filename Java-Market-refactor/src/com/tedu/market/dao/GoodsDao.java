package com.tedu.market.dao;

public class GoodsDao {
	
	
	static String goods[]=new String[1000];
//	当前最后一个商品,后面可以存放商品位置 的下标
	static int index=0;
	
//	添加商品
	public void add(String s) {
		goods[index] = s;
		index++;
	}
//	查看所有的商品
	public void lookUp() {
		for (int i = 0; i < index; i++) {			
			System.out.println(goods[i]);			
		}		
	}

}
