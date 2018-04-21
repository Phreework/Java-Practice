package com.tedu.market.gui_view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.tedu.market.dao.GoodsVarArrayDao;
import com.tedu.market.vo.Goods;

public class AddGoodsGui implements DisplayElement {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		// ���㴰��
				JFrame jf = new JFrame("���ֶ೬��");
				// �м�����
				JPanel jp = new JPanel();
				// �������
				JTextField jtfNumber = new JTextField(15);
				JTextField jtfAmount = new JTextField(15);
				JTextField jtfPrice = new JTextField(15);
				JTextField jtfName = new JTextField(15);

				JLabel jlNumber = new JLabel("��Ʒ���:");
				JLabel jlAmount = new JLabel("��Ʒ���:");
				JLabel jlPrice = new JLabel("��Ʒ�۸�:");
				JLabel jlName = new JLabel("��Ʒ��:");
				JButton addBut = new JButton("¼        ��");
				JButton quitBut = new JButton("��        ��");
				// add COM
				jp.add(jlNumber);
				jp.add(jtfNumber);
				jp.add(jlAmount);
				jp.add(jtfAmount);
				jp.add(jlPrice);
				jp.add(jtfPrice);
				jp.add(jlName);
				jp.add(jtfName);
				jp.add(addBut);
				jp.add(quitBut);
				
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
						Goods gd = new Goods(Integer.parseInt(jtfNumber.getText()), Integer.parseInt(jtfAmount.getText()), (double)Integer.parseInt(jtfPrice.getText()) ,jtfName.getText());
						GoodsVarArrayDao gvad = new GoodsVarArrayDao();
						gvad.addGoods(gd);
					}
				});
				quitBut.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						DisplayElement gui = new ManageGui();
						gui.display();
					}
				});

	}

}
