package com.supermarket.view;

import java.util.Scanner;

import com.supermarket.view.Test.Emenu;

public class ErrorMenu extends Menu {
	public Emenu print() {
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("****好又多超市欢迎你****");
		System.out.println("\t用户名或密码输入错误，请再次输入");
		System.out.println("********************");
		return Emenu.登陆;
	}
}
