package com.course.two.jframe;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class GUIDemo extends JFrame{
	void print() {

		JFrame jf = new JFrame();
		JPanel jp = new JPanel();
		JLabel jl =new JLabel(new ImageIcon("./src/img/1.jpg"));
		JButton jb = new JButton("���ɲ����̫��");
		jb.setBackground(Color.GRAY);
		//��ͼƬ����ӵ��м�����
		jp.add(jl);
		//���Ӱ�ť
		jp.add(jb);
		//���м������ӵ�����
		jf.add(jp);
		

		
		jf.setVisible(true);
		jf.setSize(1280,720);
		jf.setLocation(100, 100);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		 try
		    {
		        org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
		    }
		    catch(Exception e)
		    {
		        //TODO exception
		    }
		new GUIDemo().print(); 
	}
}

//class ButtonListener implements ActionListener {
//	
//}




