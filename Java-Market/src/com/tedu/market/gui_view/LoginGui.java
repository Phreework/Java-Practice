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

public class LoginGui {
	String name = "admin";
	String pass = "123";
	boolean t = true;
	int count = 3;

	// 成员方法
	public void printLogin() {
		// TODO Auto-generated method stub

		// 顶层窗体
		JFrame jf = new JFrame("好又多超市");
		// 中间容器
		JPanel jp = new JPanel();
		// 定义组件
		JLabel jl1 = new JLabel("用户名");
		JTextField jtf1 = new JTextField(15);
		JLabel jl2 = new JLabel("密    码");
		JPasswordField jpf = new JPasswordField(15);
		JButton jb1 = new JButton("登陆");
		// 错误输出
		JLabel jtferror = new JLabel();
		// add COM
		jp.add(jl1);
		jp.add(jtf1);
		jp.add(jl2);
		jp.add(jpf);
		jp.add(jb1);
		jp.add(jtferror);
		jf.add(jp);

		// frame pro
		jf.setVisible(true);
		jf.setSize(250, 200);
		jf.setLocation(400, 300);
		jf.setTitle("好又多超市");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		jb1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String inputName = jtf1.getText();
				String inputPass = new String(jpf.getPassword());
				if (inputName.equals(name) && inputPass.equals(pass)) {
					jf.setVisible(false);

					MainMenuGui mmg = new MainMenuGui();
					mmg.printMenuGui();
				} else {
					if (count >= 2) {
						jtferror.setText("  输入错误, 你还有" + (count - 1) + "次机会");
						count--;
					} else if (count == 1) {
						try {
							jtferror.setText("系统暂停2秒");
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

}
