package com.tedu.market.gui_view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.tedu.market.view.MainMenu;

public class PriceGui implements DisplayElement {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		// ���㴰��
		JFrame jf = new JFrame("���ֶ೬��");
		// �м�����
		JPanel jp = new JPanel();
		// �������
		JButton priceBut = new JButton("ҡ        ��");
		JButton quitBut = new JButton("��        ��");

		JLabel jl1 = new JLabel();
		// add COM
		jp.add(priceBut);
		jp.add(quitBut);
		jp.add(jl1);
		
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
				int i = (int) (Math.random() * 10);
				int r = (int) (Math.random() * 10);

				if (i == r) {

					jl1.setText("��ϲ���н��ˣ�");

				} else {
					jl1.setText("���ź�û���н�");
				}
			}
		});

		quitBut.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				DisplayElement gui = new MainMenuGui();
				gui.display();
			}
		});

	}

}
