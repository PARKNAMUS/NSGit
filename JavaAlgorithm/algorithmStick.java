package park.java.ex01;

import java.util.ArrayList;
import java.util.Scanner;

public class algorithmStick {
	/*
	�����̴� ���̰� 64cm�� ���븦 ������ �ִ�. ��� ��, �״� ���̰� Xcm�� ���밡 ������ �;�����. 
	�����̴� ���� ������ �ִ� ���븦 �� ���� ����� �ڸ�������,
	 Ǯ�� �ٿ��� ���̰� Xcm�� ���븦 ������� �Ѵ�.
	���븦 �ڸ��� ���� ���� ����� �������� �ڸ��� ���̴�. �����̴� �Ʒ��� ���� ������ ���ļ� ���븦 �ڸ����� �Ѵ�.
	1.�����̰� ������ �ִ� ������ ���̸� ��� ���Ѵ�. ó������ 64cm ���� �ϳ��� ������ �ִ�. �̶�, ���� X���� ũ�ٸ�, �Ʒ��� ���� ������ �ݺ��Ѵ�.
	2.������ �ִ� ���� �� ���̰� ���� ª�� ���� �������� �ڸ���.
	3.����, ������ �ڸ� ������ ���� �� �ϳ��� ������ �����ִ� ������ ������ ���� X���� ũ�ų� ���ٸ�, ������ �ڸ� ������ ���� �� �ϳ��� ������.
	4.����, �����ִ� ��� ���븦 Ǯ�� �ٿ��� Xcm�� �����.
	X�� �־����� ��, ���� ������ ��ģ�ٸ�, �� ���� ���븦 Ǯ�� �ٿ��� Xcm�� ���� �� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. 
		 * 
	 * 
	 * 
	 * */
	public static void main(String[] args) {
		int stickLength_temp = 64;
		int stickLength = 64;//ó�� ����� ����
		int sum = 0;
		int hopefulLength;//���ϴ� ����� ����
		ArrayList<Integer> sticks = new ArrayList<Integer>();//����� ���� ����
		ArrayList<Integer> sticksNumber = new ArrayList<Integer>();//���� ����� ���� ����
		Scanner sc = new Scanner(System.in);
		System.out.print("���ϴ� ���� �Է�: ");
		hopefulLength = sc.nextInt();

		while(stickLength>1) {
			sum = 0;//����� ���� ���� �ʱ�ȭ
			sticksNumber = new ArrayList<Integer>();//���ϸ���� ���� ���� �ʱ�ȭ
			if(hopefulLength < stickLength_temp) {//������̰� ���������� ���� ������
				stickLength = stickLength/2;	
				sticks.add(stickLength);
				sticks.add(stickLength);//����� ���� �� ����� ������ �߰�
			}else {//�������
				sticksNumber.add(stickLength);
				break;//���� ������ ����� ���� �߰��� ����
			}
			for(int i=0;i<sticks.size()-1;i++) {
				sum += sticks.get(i);//����� ���� ���� ���ϱ� 
			}
			if(sum >= hopefulLength) {//sum�� ���ϴ� ���̺��� ũ�ų� ������
				sticks.remove(sticks.size()-1);//������ ������� �ϳ� ����
				if(sum == hopefulLength) {//�� �հ谡 ���ϴ� ���̿� ������
					sticksNumber = sticks;
					break;//���� ������ �� ����� ���� ���� �� ���� 
				}else {//�� �հ谡 ���ϴ� ���̿� �ٸ���
					int sum_temp = 0;//���� �������� ����� ������� ���ϴ� ���� �������� ����
					for(int i=0;i<sticks.size();i++) {
						if(sticks.get(i)<=hopefulLength) {//����� ������ ���ϴ� ����⺸�� ������
							sum_temp += sticks.get(i);//sum_temp�� ���� ���� ���ϱ�
							sticksNumber.add(sticks.get(i));//���� ���������� �߰�
							if(sum_temp == hopefulLength)break;// ���� sum_temp�� ���ϴ� ���̿� �������� ����
							if(sum_temp>hopefulLength) {//���� sum_temp�� ���ϴ� ���̺��� Ŀ�����
								sum_temp-=sticks.get(i);//i��°������� ���� ���ְ�
								sticksNumber.remove(sticksNumber.size()-1);//������ add�� ����� ����
							}
						}
					}//
				}
			}
		}
		System.out.println("���̾���� ����� �� : "+sticksNumber.size());
	}
}








