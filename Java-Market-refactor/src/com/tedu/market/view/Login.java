package com.tedu.market.view;

import java.util.Scanner;

//类
public class Login implements DisplayElement{

	String name = "admin";
	String pass = "123";
	boolean t = true;
	int count = 3;

	// 成员方法
	public void display() {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("*********好又多超市欢迎你********");
		System.out.println("\t1.登陆");
		System.out.println("\t2.退出");
		System.out.println("****************************");
		System.out.println("请输入选择的数字");
		int i = s.nextInt();

		if (i == 1) {
			while (t) {
				System.out.println("请输入用户名：");
				String inputName = s.next();
				System.out.println("请输入密码：");
				String inputPass = s.next();

				if (inputName.equals(name) && inputPass.equals(pass)) {
					t = false;
					MainMenu mm = new MainMenu();
					mm.printMain();
				} else {
					if (count >= 2) {
						System.err.println("用户名密码错误, 你还有" + (count - 1) + "次机会");
						count--;					
					} else if (count == 1) {
						try {
							System.out.println("系统暂停2秒");
							Thread.sleep(2000);
							count = 3;
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}					
				}
			}

		}

	}

}
