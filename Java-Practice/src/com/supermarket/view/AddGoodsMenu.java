package com.supermarket.view;

import java.util.Scanner;

import com.supermarket.data.GoodsDao;
import com.supermarket.view.Test.Emenu;

public class AddGoodsMenu extends Menu {
	public Emenu print() {
		boolean t = true;

		while (t) {
			System.out.println("请输入商品信息  商品名称  商品价格");
			Scanner s = new Scanner(System.in);
			String input = s.next();

			GoodsDao gd = new GoodsDao();
			gd.add(input);

			System.out.println("是否继续添加y/n");
			Scanner s2 = new Scanner(System.in);
			String choice = s2.nextLine();
			if (!choice.equals("y")) {
				t = false;
				return Emenu.管理商品;
			}
		}
		return Emenu.主菜单;
	}
}
