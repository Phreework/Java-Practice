package com.supermarket.view;

import java.util.Scanner;

import com.supermarket.view.Test.Emenu;

public class lookMenu extends Menu {

	Emenu print() {
		Scanner s = new Scanner(System.in);

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("****���ֶ೬�л�ӭ��****");
		//������Ʒ��Ϣ���
		System.out.println("\t1.����");
		System.out.println("********************");
		System.out.println("������ѡ������֣�");
		int i = s.nextInt();
		if (i == 1)
			return Emenu.������Ʒ;
		return Emenu.����;
	}
}