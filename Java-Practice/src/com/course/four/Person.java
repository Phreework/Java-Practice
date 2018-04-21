package com.course.four;

public class Person {
	private String name;
	private int age;
	/**
	 * @param name 人名
	 * @param age 年龄
	*/
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void selfIntroduce() {
		System.out.println("我的名字是"+name+"\t我今年已经"+age+"岁了哦~");
	}
	
}
