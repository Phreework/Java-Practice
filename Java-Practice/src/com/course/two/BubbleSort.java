package com.course.two;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = { 12, 88, 53, 64, 232, 22, 23 };
		bubbleSortArr(arr);
		print(arr);

	}

	static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
	}

	static void bubbleSortArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {// ��ʾn��������̡�
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j - 1] > arr[j]) {// ǰ������ִ��ں�������־ͽ���
					// ����a[j-1]��a[j]
					int temp;
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}