package com.course.two;

class ForForDemo2 {
	public static void main(String[] args) {
		// ѭ���õ�9*9�˷���
		for (int x = 1; x <= 9; x++) {
			for (int y = 1; y <= x; y++) {
				System.out.print(y + " * " + x + " = " + (x * y) + "\t");
			}
			System.out.println();
		}
	}
}