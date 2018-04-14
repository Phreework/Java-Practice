package com.supermarket.view;

import java.util.Scanner;

import com.supermarket.view.Test.Emenu;
//finish
public class MainMenu extends Menu{
	public Emenu print() {
		Scanner s = new Scanner(System.in);
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("****好又多超市欢迎你****");
		System.out.println("\t1.抽奖");
		System.out.println("\t2.商品管理");
		System.out.println("********************");
		System.out.println("请输入选择的数字：");
		int i = s.nextInt();
		if (i == 1) 
			return Emenu.抽奖;
		if (i == 2) 
			return Emenu.管理商品;
		return Emenu.错误;
	}
	
	MainMenu() {
	}
}
