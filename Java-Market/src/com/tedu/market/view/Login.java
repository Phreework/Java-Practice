package com.tedu.market.view;

import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

//类
public class Login {

	String name = "admin";
	String pass = "123";
	boolean t = true;
	int count = 3;

	// 成员方法
	public void printLogin() {
		// TODO Auto-generated method stub
		
		//顶层窗体
		JFrame jf = new JFrame("好又多超市");
		//中间容器
		JPanel jp = new JPanel();
		//定义组件
		JLabel jl1 = new JLabel("用户名");
		JTextField jtf1 = new JTextField(20);
		JLabel jl2 = new JLabel("密    码");
		JPasswordField jpf = new JPasswordField(20);
		JButton jb1 = new JButton("登陆");
		
		//add COM
		jp.add(jl1);
		jp.add(jtf1);
		jp.add(jl2);
		jp.add(jpf);
		jp.add(jb1);
		
		jp.add(jp);
		
		//frame pro
		jf.setVisible(true);
		jf.setSize(300, 200);
		jf.setLocation(400, 300);
		jf.setTitle("好又多超市");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("*********好又多超市欢迎你********");
		System.out.println("\t1.登陆");
		System.out.println("\t2.退出");
		System.out.println("****************************");
		System.out.println("请输入选择的数字");
		int i = s.nextInt();

		if (i == 1) {
			while (t) {
				System.out.println("请输入用户名：");
				String inputName = s.next();
				System.out.println("请输入密码：");
				String inputPass = s.next();

				if (inputName.equals(name) && inputPass.equals(pass)) {
					t = false;
					MainMenu mm = new MainMenu();
					mm.printMain();
				} else {
					if (count >= 2) {
						System.err.println("用户名密码错误, 你还有" + (count - 1) + "次机会");
						count--;					
					} else if (count == 1) {
						try {
							System.out.println("系统暂停2秒");
							Thread.sleep(2000);
							count = 3;
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}					
				}
			}

		}

	}

}
