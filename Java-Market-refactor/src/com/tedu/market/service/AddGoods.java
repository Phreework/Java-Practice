package com.tedu.market.service;

import java.util.Scanner;

import com.tedu.market.dao.Goods;
import com.tedu.market.dao.GoodsVarArrayDao;
import com.tedu.market.view.GoodsManage;

public class AddGoods {

	GoodsVarArrayDao gvad = new GoodsVarArrayDao();
	public void addGoods() {

		boolean t = true;

		while (t) {
			
			Scanner s = new Scanner(System.in);
			
			System.out.println("��������Ʒ���");
			int num = s.nextInt();
			System.out.println("��������Ʒ����");
			int amount = s.nextInt();
			System.out.println("��������Ʒ�۸�");
			double price = s.nextDouble();
			System.out.println("��������Ʒ����");
			String name = s.next();
			Goods gd = new Goods(num, amount, price ,name);
			gvad.addGoods(gd);

			System.out.println("�Ƿ������� y/n");
			Scanner s2 = new Scanner(System.in);
			String choice = s2.nextLine();

			if (choice.equals("y")) {

			} else {
				t = false;
				GoodsManage gm = new GoodsManage();
				gm.goodsMenu();
			}
		}
	}

}
