package practiceOOP;



public class Student {
	private String name;

	private int age;

	private int id;

	public Student(String name, int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}

	public void study() {
		System.out.println("学生"+name+"爱学习");
	}

	// 吃饭的方法
	public void eat() {
		System.out.println("学生"+name+"要吃饭");
	}

	// 睡觉的方法
	public void sleep() {
		System.out.println("学生"+name+"想睡觉");
	}

}
