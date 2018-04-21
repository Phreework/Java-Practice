package com.tedu.market.view;

import java.util.Scanner;

import com.tedu.market.service.AddGoods;
import com.tedu.market.service.LookUpGoods;
import com.tedu.market.service.Lucky;
import com.tedu.market.service.SelectGoods;

public class GoodsManage implements DisplayElement{
	@Override
	public void display() {
		System.out.println("*********���ֶ೬�л�ӭ��********");
		 System.out.println("\t1.�����Ʒ");
		 System.out.println("\t2.�����Ʒ");
		 System.out.println("\t3.��ѯ��Ʒ");
		 System.out.println("\t4.����");	
		 System.out.println("****************************");
		 System.out.println("������ѡ�������");
		 
		 Scanner s = new Scanner(System.in);
		 int i = s.nextInt();			
			if(i==1){
				AddGoods ad = new AddGoods();
				ad.addGoods();
			}else if(i==2) {			
				LookUpGoods lup = new LookUpGoods();
				lup.lookUpGoods();
			}else if(i==3){
				SelectGoods sd = new SelectGoods();
				sd.selectGoods();
				 
			}else {
				
				MainMenu mm = new MainMenu();
				mm.printMain();
			}
	}

}
