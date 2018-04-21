package com.tedu.market.service;

import java.util.Scanner;

import com.tedu.market.view.MainMenu;

public class Lucky {
	
	public void luck() {
	
		System.out.println("请输入一个1到10的整数");
		Scanner s = new Scanner(System.in);
		
		int i = s.nextInt();
		int r = (int)(Math.random()*10);
		
		if(i==r) {
			
			System.out.println("恭喜你中奖了！");
			
		}else {
			System.out.println("很遗憾没有中奖"+r);
		}
		
		MainMenu mm = new MainMenu ();
		mm.printMain();
		
		
	}

}
