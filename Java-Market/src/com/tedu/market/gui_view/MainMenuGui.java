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
import com.tedu.market.view.GoodsManage;

public class MainMenuGui {

	public void printMenuGui() {
		//���㴰��
				JFrame jf = new JFrame("���ֶ೬��");
				//�м�����
				JPanel jp = new JPanel();
				//�������
				JButton priceBut = new JButton("��        ��");
				JButton manageBut = new JButton("��Ʒ����");
				
				//add COM
				jp.add(priceBut);
				jp.add(manageBut);
				
				jf.add(jp);
				
				//frame pro
				jf.setVisible(true);
				jf.setSize(230, 200);
				jf.setLocation(400, 300);
				jf.setTitle("���ֶ೬��");
				jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				priceBut.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						
							Lucky l = new Lucky();
							l.luck();
					}
				});
				manageBut.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						
							GoodsManage mm = new GoodsManage();
							mm.goodsMenu();	
					}
				});
	}
}
