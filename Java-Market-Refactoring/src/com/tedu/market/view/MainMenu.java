package com.tedu.market.view;

import java.util.Scanner;

import com.tedu.market.service.Lucky;

public class MainMenu {
	
	//��Ա����	
		public void printMain() {
			// TODO Auto-generated method stub
			
			 System.out.println("*********���ֶ೬�л�ӭ��********");
			 System.out.println("\t1.�齱");
			 System.out.println("\t2.��Ʒ����");
			 System.out.println("****************************");
			 Scanner s = new Scanner(System.in);
			 int i = s.nextInt();			
				if(i==1){
					Lucky l = new Lucky();
					l.luck();
				}else if(i==2) {			
//					GoodsManage mm = new GoodsManage();
//					mm.goodsMenu();	
				}else {
					
					System.out.println("��������");
				}
		}

}
