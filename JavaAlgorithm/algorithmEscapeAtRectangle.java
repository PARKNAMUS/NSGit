package park.java.ex01;

import java.util.Scanner;

public class algorithmEscapeAtRectangle {

	/*
	 * �Ѽ��� ���� (x, y)�� �ִ�. ���簢���� ���� �Ʒ� �������� (0, 0)�� �ְ�, ������ �� �������� (w, h)�� �ִ�. 
	 * ���簢���� ��輱���� ���� �Ÿ��� �ּڰ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 *
	 * ù° �ٿ� x y w h�� �־�����.
	 *  w�� h�� 1,000���� �۰ų� ���� �ڿ����̰�, x�� 1���� ũ�ų� ����, 
	 *  w-1���� �۰ų� ���� �ڿ����̰�, y�� 1���� ũ�ų� ����,
	 *   h-1���� �۰ų� ���� �ڿ����̴�.
	 * 
	 * */
	public static void main(String[] args) {
		int x;//x��ǥ
		int y;//y��ǥ
		int w;//w��ǥ
		int h;//h��ǥ
		int [] arr = new int [4];
		int min = 0;//�ּҰŸ� ���ϱ�����
		Scanner sc = new Scanner(System.in);
		System.out.print("x(1���� ũ�ų� ���� w-1���� �۰ų� ���� �ڿ���) :");
		x = sc.nextInt();
		System.out.print("y((1���� ũ�ų� ���� h-1���� �۰ų� ���� �ڿ���)) :");
		y = sc.nextInt();
		System.out.print("w(1000���� �۰ų� ���� �ڿ���) :");
		w = sc.nextInt();
		System.out.print("h(1000���� �۰ų� ���� �ڿ���) :");
		h = sc.nextInt();
		
		arr[0] = w-x;//x��ǥ���� w��ǥ������ �Ÿ�
		arr[1] = x;//x��ǥ���� 0(�ذ��) ������ �Ÿ�
		arr[2] = h-y;//y��ǥ���� h��ǥ������ �Ÿ�
		arr[3] = y;//y��ǥ���� 0������ �Ÿ�
		
		
		for(int i=0;i<arr.length;i++) {//�ݺ��ϸ� �ּұ��� ����
			if(i<arr.length-1) {
				if(arr[i]>arr[i+1]) {
					min = arr[i+1];
				}else {
					min = arr[i];
				}
			}
		}
		System.out.println("���簢�� �������� �ּҰŸ�: "+min);
	}
}
