package com.phree.tool.common;

public class ArrayTool {
	/**
	 * 打印数组内容
	 * @param arr 数组对象
	 */
	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
	}
	/**
	 * 冒泡排序
	 * @param arr 数组对象
	 */
	public static void bubbleSortArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {// 表示n次排序过程。
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j - 1] > arr[j]) {// 前面的数字大于后面的数字就交换
					// 交换a[j-1]和a[j]
					int temp;
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
