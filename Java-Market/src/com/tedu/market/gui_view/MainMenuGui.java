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
		//顶层窗体
				JFrame jf = new JFrame("好又多超市");
				//中间容器
				JPanel jp = new JPanel();
				//定义组件
				JButton priceBut = new JButton("抽        奖");
				JButton manageBut = new JButton("商品管理");
				
				//add COM
				jp.add(priceBut);
				jp.add(manageBut);
				
				jf.add(jp);
				
				//frame pro
				jf.setVisible(true);
				jf.setSize(230, 200);
				jf.setLocation(400, 300);
				jf.setTitle("好又多超市");
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
