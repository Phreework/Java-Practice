package com.tedu.market.gui_view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.tedu.market.service.GetGoods;
import com.tedu.market.vo.Goods;

public class ManageGui implements DisplayElement {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		// 顶层窗体
		JFrame jf = new JFrame("好又多超市");
		// 中间容器
		JPanel jp = new JPanel();
		// 定义组件
		JButton addBut = new JButton("添加商品");
		JButton selectAllBut = new JButton("显示所有商品");
		JButton selectBut = new JButton("查询商品");
		JLabel jlGoodsInfo = new JLabel();

		// add COM
		jp.add(addBut);
		jp.add(selectAllBut);
		jp.add(selectBut);
		jp.add(jlGoodsInfo);
		
		jf.add(jp);
		

		// frame pro
		jf.setVisible(true);
		jf.setSize(640, 360);
		jf.setLocation(400, 300);
		jf.setTitle("好又多超市");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		addBut.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				DisplayElement gui = new AddGoodsGui();
				gui.display();
				
			}
		});
		selectAllBut.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				GetGoods getgd = new GetGoods();
				Goods[] gd = getgd.getGoods();
				String goodsInfo = "";
				for(int i=0; i < gd.length; i++) {
					goodsInfo += gd[i].toString();
					goodsInfo += "\n";
				}
				
				jlGoodsInfo.setText(goodsInfo);
			}
		});
		selectBut.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					
			}
		});

	}

}
