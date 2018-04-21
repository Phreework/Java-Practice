package com.tedu.market.gui_view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.tedu.market.service.Lucky;


public class MainMenuGui implements DisplayElement {

	public void display() {
		// ���㴰��
		JFrame jf = new JFrame("���ֶ೬��");
		// �м�����
		JPanel jp = new JPanel();
		// �������
		JButton priceBut = new JButton("��        ��");
		JButton manageBut = new JButton("��Ʒ����");

		// add COM
		jp.add(priceBut);
		jp.add(manageBut);
		jf.add(jp);

		// frame pro
		jf.setVisible(true);
		jf.setSize(640, 360);
		jf.setLocation(400, 300);
		jf.setTitle("���ֶ೬��");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		priceBut.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

				DisplayElement gui = new PriceGui();
				gui.display();
			}
		});
		manageBut.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

				DisplayElement gui = new ManageGui();
				gui.display();
			}
		});
	}
}
