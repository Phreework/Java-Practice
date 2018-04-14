package com.supermarket.view;

import java.util.Scanner;

import com.supermarket.view.Test.Emenu;

public class lookMenu extends Menu {

	Emenu print() {
		Scanner s = new Scanner(System.in);

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("****好又多超市欢迎你****");
		//所有商品信息输出
		System.out.println("\t1.返回");
		System.out.println("********************");
		System.out.println("请输入选择的数字：");
		int i = s.nextInt();
		if (i == 1)
			return Emenu.管理商品;
		return Emenu.错误;
	}
}
