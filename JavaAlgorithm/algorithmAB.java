package park.java.ex01;

import java.util.Scanner;

public class algorithmAB {
/*
 * ����̴� �ֽ� ��ǻ�� 10�븦 ������ �ִ�. ��� �� ����̴� ���� �����͸� ó���ؾ� �� ���� ���ܼ� �� ��ǻ�Ϳ� 1������ 10�������� ��ȣ�� �ο��ϰ�, 
 * 10���� ��ǻ�Ͱ� ������ ���� ������� �����͵��� ó���ϱ�� �Ͽ���.
1�� �����ʹ� 1�� ��ǻ��, 2�� �����ʹ� 2�� ��ǻ��, 3�� �����ʹ� 3�� ��ǻ��, ... ,
10�� �����ʹ� 10�� ��ǻ��, 11�� �����ʹ� 1�� ��ǻ��, 12�� �����ʹ� 2�� ��ǻ��, ...
�� �������� ������ �׻� a^b���� ���·� �־�����. ����̴� ���� ������ �����Ͱ� ó���� ��ǻ���� ��ȣ�� �ñ�������. �̸� �������ִ� ���α׷��� �ۼ��϶�.
 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A;//����
		int B;//A�� ������ ����
		int data = 0;//������ ����
		int result = 0;//������ ������ ��
		System.out.print("A�Է�: ");
		A = sc.nextInt();
		System.out.print("B�Է�: ");
		B = sc.nextInt();
		data = A;
		for(int i=0;i<B-1;i++) {
			data *=A;
		}
		for(int i=0;i<data;i++) {
			result++;
			System.out.println(result);
			if(result == 10) {
				result = 0;
			}
		}
		System.out.println("������ ������ : "+result);
	}
}
