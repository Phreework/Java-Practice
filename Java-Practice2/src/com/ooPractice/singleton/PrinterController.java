package com.ooPractice.singleton;

public class PrinterController {
	public static void main(String args[]) {
		Printer printer = Printer.getInstance();
		printer.fill();
		printer.load();
		printer.drain();

		//��δ��ʾ�������򷵻�ʵ����ͬ
		Printer printer2 = Printer.getInstance();
	}
}
