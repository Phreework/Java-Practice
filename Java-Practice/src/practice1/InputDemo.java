package practice1;

/*
	这是测试键盘输入数据的demo
	-------------------------
	导入scanner包用scanner类实现数据输入
 */
import java.util.Scanner;
public class InputDemo {
	public static void main(String argsp[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入第一个数字：");
		int a = sc.nextInt();
		System.out.println("请输入第二个数字：");
		int b = sc.nextInt();
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		boolean c = a==b;
		System.out.println(c);
	}
}
