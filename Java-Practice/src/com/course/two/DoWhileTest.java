package com.course.two;

class DoWhileTest {
	public static void main(String[] args) {
		
		for(int x = 10; x<20; x++) {
			System.out.println("hello");
		}

		int y = 10;
		while(y<20){
			System.out.println("world");
			y++;
		}

		int z = 10;
		do{
			System.out.println("java");
			z++;
		}while(z>20);
	
		/*
		for(;;){
			System.out.println("haha");
		}
		*/
		/*
		while(true) {
			System.out.println("haha");
		}
		*/
	}
}
