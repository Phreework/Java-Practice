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

public class LoginGui implements DisplayElement{
	String name = "admin";
	String pass = "123";
	boolean t = true;
	int count = 3;

	// ��Ա����
	public void display() {
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
		
		
		
		
		
		addComToPanel(jf, jp, jl1, jtf1, jl2, jpf, jb1, jtferror);

		setFrame(jf);

		jb1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String inputName = jtf1.getText();
				String inputPass = new String(jpf.getPassword());
				if (inputName.equals(name) && inputPass.equals(pass)) {
					jf.setVisible(false);

					DisplayElement gui = new MainMenuGui();
					gui.display();
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

	private void setFrame(JFrame jf) {
		// frame pro
		jf.setVisible(true);
		jf.setSize(640, 360);
		jf.setLocation(400, 300);
		jf.setTitle("���ֶ೬��");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void addComToPanel(JFrame jf, JPanel jp, JLabel jl1, JTextField jtf1, JLabel jl2, JPasswordField jpf,
			JButton jb1, JLabel jtferror) {
		// add COM
		jp.add(jl1);
		jp.add(jtf1);
		jp.add(jl2);
		jp.add(jpf);
		jp.add(jb1);
		jp.add(jtferror);
		jf.add(jp);
	}

}
