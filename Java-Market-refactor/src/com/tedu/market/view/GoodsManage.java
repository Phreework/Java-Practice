package com.tedu.market.view;

import java.util.Scanner;

import com.tedu.market.service.AddGoods;
import com.tedu.market.service.LookUpGoods;
import com.tedu.market.service.Lucky;
import com.tedu.market.service.SelectGoods;

public class GoodsManage implements DisplayElement{
	@Override
	public void display() {
		System.out.println("*********好又多超市欢迎你********");
		 System.out.println("\t1.添加商品");
		 System.out.println("\t2.浏览商品");
		 System.out.println("\t3.查询商品");
		 System.out.println("\t4.返回");	
		 System.out.println("****************************");
		 System.out.println("请输入选择的数字");
		 
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
