package com.phree.tool.common;

public class ArrayTool {
	/**
	 * ��ӡ��������
	 * @param arr �������
	 */
	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
	}
	/**
	 * ð������
	 * @param arr �������
	 */
	public static void bubbleSortArr(int[] arr) {
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