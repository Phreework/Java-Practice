package com.tedu.market.service;

import java.util.Scanner;

import com.tedu.market.dao.GoodsVarArrayDao;
import com.tedu.market.view.GoodsManage;
import com.tedu.market.vo.Goods;

public class SelectGoods {

	GoodsVarArrayDao gvad = new GoodsVarArrayDao();

	public void selectGoods() {


			Scanner s = new Scanner(System.in);

			System.out.println("1.ͨ����Ʒ��Ų�ѯ");
			System.out.println("2.ͨ����Ʒ���ֲ�ѯ");
			int select = s.nextInt();
			if (select == 1) {
				System.out.println("��������Ʒ��ţ�");
				int num = s.nextInt();
				gvad.selectInGoods(num);
			} else if (select == 2) {
				System.out.println("��������Ʒ���֣�");
				String name = s.next();
				gvad.selectInGoods(name);
			} else {
				System.out.println("�������");
				GoodsManage gm = new GoodsManage();
				gm.goodsMenu();
			}
			
	}

}
