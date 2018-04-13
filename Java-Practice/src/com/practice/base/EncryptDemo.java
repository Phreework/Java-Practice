package com.practice.base;
import java.util.Scanner;

/*
ĳ����˾���ù��õ绰����������Ϣ��������С��8λ��������Ϊ��ȷ����ȫ��
�ڴ��ݹ�������Ҫ���ܣ����ܹ������£�
	���Ƚ����ݵ���Ȼ��ÿλ���ֶ�����5�����úͳ���10��������������֣�
	��󽫵�һλ�����һλ���ֽ����� ���������һ��С��8λ��������
	Ȼ�󣬰Ѽ��ܺ�Ľ���ڿ���̨��ӡ������
������
	A:������С��8λ������
		�����Ǳ仯�ġ�(����0��ͷ)
	B:���ܹ���
		��������Ϊ��123456
		���Ƚ����ݵ���
			654321
		Ȼ��ÿλ���ֶ�����5�����úͳ���10���������������
			109876
		��󽫵�һλ�����һλ���ֽ���
			609871
	C:������
		609871
*/
class EncryptDemo{
	public static void main(String[] args) {
		//��������¼�����
		Scanner sc = new Scanner(System.in);

		//����¼������
		System.out.println("����������(С��8λ������)��");
		int number = sc.nextInt();

		jiaMi(number);
	}

	public static void jiaMi(int number) {
		int[] arr = new int[8];

		//��һ��
		int index = 0;

		while(number>0) {
			arr[index++] = number%10;
			number /= 10;
		}

		//�ڶ���
		for(int x=0; x<index; x++) {
			arr[x] += 5;
			arr[x] %= 10;
		}

		//������
		int temp = arr[0];
		arr[0] = arr[index-1];
		arr[index-1] = temp;

		//���
		for(int x=0; x<index; x++) {
			System.out.print(arr[x]);
		}
		System.out.println();
	}
}