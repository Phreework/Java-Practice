package com.tedu.market.dao;

public class GoodsDao {
	
	
	static String goods[]=new String[1000];
//	��ǰ���һ����Ʒ,������Դ����Ʒλ�� ���±�
	static int index=0;
	
//	�����Ʒ
	public void add(String s) {
		goods[index] = s;
		index++;
	}
//	�鿴���е���Ʒ
	public void lookUp() {
		for (int i = 0; i < index; i++) {			
			System.out.println(goods[i]);			
		}		
	}

}
