package com.tedu.market.gui_view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginGui {
	String name = "admin";
	String pass = "123";
	boolean t = true;
	int count = 3;

	// ��Ա����
	public void printLogin() {
		// TODO Auto-generated method stub

		// ���㴰��
		JFrame jf = new JFrame("���ֶ೬��");
		// �м�����
		JPanel jp = new JPanel();
		// �������
		JLabel jl1 = new JLabel("�û���");
		JTextField jtf1 = new JTextField(15);
		JLabel jl2 = new JLabel("��    ��");
		JPasswordField jpf = new JPasswordField(15);
		JButton jb1 = new JButton("��½");
		// �������
		JLabel jtferror = new JLabel();
		// add COM
		jp.add(jl1);
		jp.add(jtf1);
		jp.add(jl2);
		jp.add(jpf);
		jp.add(jb1);
		jp.add(jtferror);
		jf.add(jp);

		// frame pro
		jf.setVisible(true);
		jf.setSize(250, 200);
		jf.setLocation(400, 300);
		jf.setTitle("���ֶ೬��");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		jb1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String inputName = jtf1.getText();
				String inputPass = new String(jpf.getPassword());
				if (inputName.equals(name) && inputPass.equals(pass)) {
					jf.setVisible(false);

					MainMenuGui mmg = new MainMenuGui();
					mmg.printMenuGui();
				} else {
					if (count >= 2) {
						jtferror.setText("  �������, �㻹��" + (count - 1) + "�λ���");
						count--;
					} else if (count == 1) {
						try {
							jtferror.setText("ϵͳ��ͣ2��");
							Thread.sleep(2000);
							count = 3;
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
		});

	}

}
