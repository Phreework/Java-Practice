package com.supermarket.view;

import java.util.Scanner;

import com.supermarket.view.Test.Emenu;

public class ManagerMenu extends Menu {
	Emenu print() {
		Scanner s = new Scanner(System.in);

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("****���ֶ೬�л�ӭ��****");
		System.out.println("\t1.������Ʒ");
		System.out.println("\t2.�����Ʒ");
		System.out.println("\t3.��ѯ��Ʒ");
		System.out.println("\t4.�˳�");
		System.out.println("********************");
		System.out.println("������ѡ������֣�");
		int i = s.nextInt();
		if (i == 1)
			return Emenu.������Ʒ;
		if (i == 2)
			return Emenu.�����Ʒ;
		if (i == 2)
			return Emenu.��ѯ��Ʒ;
		if (i == 3)
			return Emenu.�˳�;
		return Emenu.����;
	}
}