package com.supermarket;

import java.util.Scanner;

import com.supermarket.Test.Emenu;

public class ManagerMenu extends Menu {
	Emenu print() {
		Scanner s = new Scanner(System.in);

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("****好又多超市欢迎你****");
		System.out.println("\t1.添加商品");
		System.out.println("\t2.浏览商品");
		System.out.println("\t3.查询商品");
		System.out.println("\t4.退出");
		System.out.println("********************");
		System.out.println("请输入选择的数字：");
		int i = s.nextInt();
		if (i == 1)
			return Emenu.添加商品;
		if (i == 2)
			return Emenu.浏览商品;
		if (i == 2)
			return Emenu.查询商品;
		if (i == 3)
			return Emenu.退出;
		return Emenu.错误;
	}
}
