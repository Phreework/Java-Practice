package com.course.three;

public class Person {
	private String name;
	private int age;
	/**
	 * @param name ����
	 * @param age ����
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
		System.out.println("�ҵ�������"+name+"\t�ҽ����Ѿ�"+age+"����Ŷ~");
	}
	
}