package com.course.two;

class MuiltTableDemo {
	public static void main(String[] args) {
		
		// 循环得到乘法表
		for (int x = 1; x <= 9; x++) {
			for (int y = 1; y <= x; y++) {
				System.out.print(y + " * " + x + " = " + (x * y) + "\t");
			}
			System.out.println();
		}
	}
}