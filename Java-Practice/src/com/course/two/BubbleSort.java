package com.course.two;
import com.phree.tool.common.ArrayTool;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = { 12, 88, 53, 64, 232, 22, 23 };
		ArrayTool.bubbleSortArr(arr);
		ArrayTool.print(arr);
	}	
}
