package com.course.two;

public class PrimeNumberDemo {
	static int arrayIndex = 0;
	static int[] arr;
	public static void main(String[] args) {
		print(arr);
	}
	

	static int[] getPrimeNumber(int min, int max) {

		for (int i = min; i <= max; i++) {
			for (int j = 2; j < i; ++j) {
				if (i % j == 0) {
					break;
				} else if(j == i) {
					arrayControl(i);
				}
			}
			
		}
		return arr;
	}
	
	static void arrayControl(int number) {
		arr[arrayIndex] = number;
		arrayIndex++;
	}
	
	static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
	}
}