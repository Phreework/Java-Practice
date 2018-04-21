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
		// 顶层窗体
		JFrame jf = new JFrame("好又多超市");
		// 中间容器
		JPanel jp = new JPanel();
		// 定义组件
		JButton priceBut = new JButton("抽        奖");
		JButton manageBut = new JButton("商品管理");

		// add COM
		jp.add(priceBut);
		jp.add(manageBut);
		jf.add(jp);

		// frame pro
		jf.setVisible(true);
		jf.setSize(640, 360);
		jf.setLocation(400, 300);
		jf.setTitle("好又多超市");
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
