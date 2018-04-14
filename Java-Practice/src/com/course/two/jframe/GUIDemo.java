package com.course.two.jframe;

import java.awt.Color;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class GUIDemo extends JFrame{
	static void print() {

		JFrame jf = new JFrame();
		JPanel jp = new JPanel();
		JLabel jl =new JLabel(new ImageIcon("./src/img/1.jpg"));
		JButton jb = new JButton("这个刹车不太灵");
		jb.setBackground(Color.GRAY);
		//将图片组件加到中间容器
		jp.add(jl);
		//添加按钮
		jp.add(jb);
		//将中间容器加到窗体
		jf.add(jp);
		

		
		jf.setVisible(true);
		jf.setSize(1280,720);
		jf.setLocation(100, 100);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		print();
	}
}
