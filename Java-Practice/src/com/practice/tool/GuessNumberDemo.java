package com.practice.tool;
import java.util.Scanner;
/*
猜数字小游戏
分析：
	1.系统产生一个1-100之间的随机数。
		int number = (int)(Math.random()*100)+1;
	2.键盘录入数据,用Scanner实现
	3.用这两个数据进行比较
		大	提示大了
		小	提示小了
		等	恭喜你，猜中了
	4.为了保证我们能够猜中，while循环实现多次猜。直到猜中。
*/
class GuessNumberDemo {
public static void main(String[] args) {
	//系统产生一个1-100之间的随机数。
	int number = (int)(Math.random()*100)+1;
	System.out.println(number);
	//this is a interesting structure
	while(true) {
		//键盘录入数据,用Scanner实现
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数据：(1-100)");
		int guessNumber = sc.nextInt();
		//用这两个数据进行比较
		if(guessNumber > number) {
			System.out.println("你猜的数据"+guessNumber+"大了");
		}else if(guessNumber < number) {
			System.out.println("你猜的数据"+guessNumber+"小了");
		}else {
			System.out.println("恭喜你，猜中了");
			break;
		}
	}
	
}
}
