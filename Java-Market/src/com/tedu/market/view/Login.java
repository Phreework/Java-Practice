package com.tedu.market.view;

import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

//��
public class Login {

	String name = "admin";
	String pass = "123";
	boolean t = true;
	int count = 3;

	// ��Ա����
	public void printLogin() {
		// TODO Auto-generated method stub
		
		//���㴰��
		JFrame jf = new JFrame("���ֶ೬��");
		//�м�����
		JPanel jp = new JPanel();
		//�������
		JLabel jl1 = new JLabel("�û���");
		JTextField jtf1 = new JTextField(20);
		JLabel jl2 = new JLabel("��    ��");
		JPasswordField jpf = new JPasswordField(20);
		JButton jb1 = new JButton("��½");
		
		//add COM
		jp.add(jl1);
		jp.add(jtf1);
		jp.add(jl2);
		jp.add(jpf);
		jp.add(jb1);
		
		jp.add(jp);
		
		//frame pro
		jf.setVisible(true);
		jf.setSize(300, 200);
		jf.setLocation(400, 300);
		jf.setTitle("���ֶ೬��");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
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
