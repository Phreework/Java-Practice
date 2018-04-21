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
		// 顶层窗体
		JFrame jf = new JFrame("好又多超市");
		// 中间容器
		JPanel jp = new JPanel();
		// 定义组件
		JButton priceBut = new JButton("摇        奖");
		JButton quitBut = new JButton("返        回");

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
		jf.setTitle("好又多超市");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		priceBut.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				int i = (int) (Math.random() * 10);
				int r = (int) (Math.random() * 10);

				if (i == r) {

					jl1.setText("恭喜你中奖了！");

				} else {
					jl1.setText("很遗憾没有中奖");
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
