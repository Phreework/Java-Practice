package com.course.two;

public class ClearSweep {
	public static void main(String[] args) {
		int[][] arr = new int[6][6];
		initArray(arr);
		setSweep(arr);
		print(arr);	
	}

	
	
	static void initArray(int[][] arr) {
		for (int y = 0; y <= 5; y++) {
			for (int x = 0; x <= 5; x++) {
				arr[y][x] = 0;
			}
		}
	}	
	static void setSweep(int[][] arr) {
		int count = 0;
		while (count <= 4) {
			int _x = (int) (Math.random() * 6);
			int _y = (int) (Math.random() * 6);
			if (arr[_x][_y] == 0) {
				arr[_x][_y] = 1;
				count++;
			}
		}
	}
	static void print(int[][] arr) {
		for (int y = 0; y <= 4; y++) {
			for (int x = 0; x <= 5; x++) {
				System.out.print(arr[y][x]);
			}
			System.out.println();
		}
	}
}
