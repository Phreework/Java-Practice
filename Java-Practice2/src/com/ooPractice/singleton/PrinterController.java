package com.ooPractice.singleton;

public class PrinterController {
	public static void main(String args[]) {
		Printer printer = Printer.getInstance();
		printer.fill();
		printer.load();
		printer.drain();

		//若未显示创建，则返回实例相同
		Printer printer2 = Printer.getInstance();
	}
}
