package com.supermarket.view;

import java.util.Scanner;

import com.supermarket.service.User;
import com.supermarket.view.Test.Emenu;

public class LoginMenu extends Menu {
	User user = new User();
	public Emenu print() {
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("****���ֶ೬�л�ӭ��****");
		System.out.println("\t�������û�����");
		String printName = s.next();
		System.out.println("���������룺");
		String printPass = s.next();
		if  (printName.equals(user.getName())  && printPass.equals(user.getPass())) {
			System.out.println("��½�ɹ�");
			return Emenu.���˵�;
		}
		System.out.println("********************");
		return Emenu.����;
	}
	LoginMenu(){};
}