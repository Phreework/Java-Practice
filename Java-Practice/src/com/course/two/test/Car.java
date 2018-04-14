package com.course.two.test;

public class Car {
	String name;
	Color color;
	float speed;
	Dir dir;

	public Car(String name) {
		this.name = name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

	void setColor(Color col) {
		this.color = col;
	}

	Color getColor() {
		return color;
	}

	void setSpeed(float speed) {
		this.speed = speed;
	}

	float getSpeed() {
		return speed;
	}

	void setDir(Dir dir) {
		this.dir = dir;
	}

	Dir getDir() {
		return dir;
	}

	void start() {
		System.out.println(name + "启动了！！！");
	}

	void stop() {
		System.out.println(name + "停止了！！！");
	}

	void speedUp() {
		System.out.println(name + "开始加速");
	}

	void changeDir(String dir) {
		System.out.println(name + "向"+dir+"转弯");
	}

}
