package com.supermarket.view;

import java.util.Scanner;

import com.supermarket.service.User;
import com.supermarket.view.Test.Emenu;

public class LoginMenu extends Menu {
	User user = new User();
	public Emenu print() {
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("****好又多超市欢迎你****");
		System.out.println("\t请输入用户名：");
		String printName = s.next();
		System.out.println("请输入密码：");
		String printPass = s.next();
		if  (printName.equals(user.getName())  && printPass.equals(user.getPass())) {
			System.out.println("登陆成功");
			return Emenu.主菜单;
		}
		System.out.println("********************");
		return Emenu.错误;
	}
	LoginMenu(){};
}
