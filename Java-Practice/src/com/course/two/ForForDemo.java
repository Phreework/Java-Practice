package com.course.two;

class ForForDemo {
	public static void main(String[] args) {
		// 同样的事情做了很多次
		for (int y = 0; y <= 4; y++) {
			for (int x = 0; x <= 4; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
