package com.tedu.market.service;

import java.util.Scanner;

import com.tedu.market.view.MainMenu;

public class Lucky {
	
	public void luck() {
	
		System.out.println("������һ��1��10������");
		Scanner s = new Scanner(System.in);
		
		int i = s.nextInt();
		int r = (int)(Math.random()*10);
		
		if(i==r) {
			
			System.out.println("��ϲ���н��ˣ�");
			
		}else {
			System.out.println("���ź�û���н�"+r);
		}
		
		MainMenu mm = new MainMenu ();
		mm.printMain();
		
		
	}

}
