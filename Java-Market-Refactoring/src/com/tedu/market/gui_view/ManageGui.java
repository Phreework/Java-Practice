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
		// ���㴰��
		JFrame jf = new JFrame("���ֶ೬��");
		// �м�����
		JPanel jp = new JPanel();
		// �������
		JButton addBut = new JButton("�����Ʒ");
		JButton selectAllBut = new JButton("��ʾ������Ʒ");
		JButton selectBut = new JButton("��ѯ��Ʒ");
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
		jf.setTitle("���ֶ೬��");
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
