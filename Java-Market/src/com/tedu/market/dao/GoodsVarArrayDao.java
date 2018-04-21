package com.tedu.market.dao;

import java.util.Scanner;

import com.tedu.market.view.GoodsManage;
import com.tedu.market.view.MainMenu;
import com.tedu.market.vo.Goods;

public class GoodsVarArrayDao {
	static Goods goodsArray[] = new Goods[100];

	static int index = 0;

	public boolean addGoods(Goods g) {
		boolean t = true;
		goodsArray[index++] = g;
		return t;
	}

	public void lookUp() {
		for (int i = 0;i<index;i++) {
			System.out.println(goodsArray[i].toString());
		}
	}

	public void selectInGoods(int num) {
		for (int i = 0;i<index;i++) {
			if(num == goodsArray[i].getGoodsNum()) {
				System.out.println("�ҵ�����Ʒ��");
				System.out.println(goodsArray[i].toString());
				GoodsManage gm = new GoodsManage();
				gm.goodsMenu();
				break;
			}
			if (i == index-1) {
				System.out.println("δ�ҵ�����Ʒ��");
				GoodsManage gm = new GoodsManage();
				gm.goodsMenu();
			}
		}
	}
	
	public void selectInGoods(String name) {
		for (int i = 0;i<index;i++) {
			if(name.equals(goodsArray[i].getGoodsName())) {
				System.out.println("�ҵ�����Ʒ��");
				System.out.println(goodsArray[i].toString());
				GoodsManage gm = new GoodsManage();
				gm.goodsMenu();
				break;
			}
			if (i == index-1) {
				System.out.println("δ�ҵ�����Ʒ��");
				GoodsManage gm = new GoodsManage();
				gm.goodsMenu();
			}
		}
	}

}
