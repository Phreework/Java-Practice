package com.course.two;

public class NarcissusDemo {

	public static void main(String[] args) {
		useWhileGetNarcissus();
	}

	static void useWhileGetNarcissus() {
		// while
		int x = 100;
		while (x < 1000) {
			int ge = x % 10;
			int shi = x / 10 % 10;
			int bai = x / 100 % 10;

			if (x == (ge * ge * ge + shi * shi * shi + bai * bai * bai)) {
				System.out.println(x);
			}
			
			x++;
		}

	}
}
