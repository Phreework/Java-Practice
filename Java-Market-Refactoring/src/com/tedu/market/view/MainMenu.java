package com.tedu.market.view;

import java.util.Scanner;

import com.tedu.market.service.Lucky;

public class MainMenu {
	
	//成员方法	
		public void printMain() {
			// TODO Auto-generated method stub
			
			 System.out.println("*********好又多超市欢迎你********");
			 System.out.println("\t1.抽奖");
			 System.out.println("\t2.商品管理");
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
					
					System.out.println("输入有误");
				}
		}

}
