package park.java.ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class algorithmAddress {
/**
 * �缮�̴� �빮�� ���̴� (�ּҸ� ��Ÿ����) ȣ���� ���۾�ü�� �����̴�.
 *  ������ ������ ȣ������ ���ڿ� ���� ���� �׸��� ���� ���������� 
 *  ������ ������ �� ����ϰ� ���ڸ��� �����ϴ� ������ ���ݾ� �����ϴ�.
 *   �����̵� ��Ģ�� �ſ� �����ϴ�. 
1.�� ���� ���̿��� 1cm�� ������ �����Ѵ�.
2.1�� 2cm�� �ʺ� �����ؾ��Ѵ�. 0�� 4cm�� �ʺ� �����ؾ��Ѵ�. ������ ���ڴ� ��� 3cm�� �ʺ� �����Ѵ�.
3.ȣ������ ���� ���� ���̿��� 1cm�� ������ �����Ѵ�.
 * �缮�̴� ������ �����ؾ��� ȣ������ �ʺ� �󸶳� �Ǵ��� �ñ�������. �缮�̸� ��������!
 */
	public static void main(String[] args) {
		String address;//�ּ�
		int width = 0;//ȣ������ �ʺ�
		Scanner sc = new Scanner(System.in);
		System.out.print("�ּ�: ");
		address = sc.nextLine();
		for(int i=0;i<address.length();i++) {
			if(address.charAt(i)-48 == 1) {//�ּ� ���ڰ� 1 �ϰ��
				width += 2;
			}else if(address.charAt(i)-48 == 0) {//�ּұ��ڰ� 0 �ϰ��
				width += 4;
			}else {
				width += 3;
			}
		}
		width+=(address.length() +1);//���� ��
		System.out.println("ȣ������ �ʺ�: "+width);
	}
}
