package com.tedu.market.view;

import java.util.Scanner;

//��
public class Login implements DisplayElement{

	String name = "admin";
	String pass = "123";
	boolean t = true;
	int count = 3;

	// ��Ա����
	public void display() {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("*********���ֶ೬�л�ӭ��********");
		System.out.println("\t1.��½");
		System.out.println("\t2.�˳�");
		System.out.println("****************************");
		System.out.println("������ѡ�������");
		int i = s.nextInt();

		if (i == 1) {
			while (t) {
				System.out.println("�������û�����");
				String inputName = s.next();
				System.out.println("���������룺");
				String inputPass = s.next();

				if (inputName.equals(name) && inputPass.equals(pass)) {
					t = false;
					MainMenu mm = new MainMenu();
					mm.printMain();
				} else {
					if (count >= 2) {
						System.err.println("�û����������, �㻹��" + (count - 1) + "�λ���");
						count--;					
					} else if (count == 1) {
						try {
							System.out.println("ϵͳ��ͣ2��");
							Thread.sleep(2000);
							count = 3;
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}					
				}
			}

		}

	}

}
