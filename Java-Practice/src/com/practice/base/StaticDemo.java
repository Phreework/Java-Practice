package com.practice.base;

/*
static:��̬�ؼ��֡�

���ã�
	�������γ�Ա�����ͳ�Ա����
�ص㣺
	1.������ļ��ض�����	
	2.�����ڶ������
	3.��������ж�����
		��Ҳ�������ж��Ƿ�ʹ�þ�̬�ؼ��ֵ�����
	4.����ͨ����������
		���ǵĵ��üȿ����Ƕ��󣬻�����������
*/
class ShowSth {
	public void show() {
		System.out.println("show");
	}

	public static void show2() {
		System.out.println("show2");
	}
}

class StaticDemo {
	public static void main(String[] args) {
		ShowSth s = new ShowSth();
		s.show();
		s.show2();

		ShowSth.show2();
	}
}