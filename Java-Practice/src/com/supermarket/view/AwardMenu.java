package com.supermarket.view;

import java.util.Scanner;

import com.supermarket.view.Test.Emenu;

public class AwardMenu extends Menu{
	
	public Emenu print() {
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("****���ֶ೬�л�ӭ��****");
		System.out.println("\t��ϲ�н�");
		System.out.println("\t1.�˳�");
		System.out.println("********************");
		System.out.println("������ѡ������֣�");
		int i = s.nextInt();
		if (i == 1) 
			return Emenu.���˵�;
		return Emenu.����;
	}
	AwardMenu(){};
}
