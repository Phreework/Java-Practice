package com.tedu.market.service;

import java.util.Scanner;

import com.tedu.market.dao.GoodsVarArrayDao;
import com.tedu.market.view.GoodsManage;
import com.tedu.market.vo.Goods;

public class SelectGoods {

	GoodsVarArrayDao gvad = new GoodsVarArrayDao();

	public void selectGoods() {


			Scanner s = new Scanner(System.in);

			System.out.println("1.通过商品编号查询");
			System.out.println("2.通过商品名字查询");
			int select = s.nextInt();
			if (select == 1) {
				System.out.println("请输入商品编号：");
				int num = s.nextInt();
				gvad.selectInGoods(num);
			} else if (select == 2) {
				System.out.println("请输入商品名字：");
				String name = s.next();
				gvad.selectInGoods(name);
			} else {
				System.out.println("输入错误！");
				GoodsManage gm = new GoodsManage();
				gm.goodsMenu();
			}
			
	}

}
