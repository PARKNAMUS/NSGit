package park.java.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IdentifyNumberCheck{
	
	public static void main(String[] args) throws Exception{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int numbers [];//��ȣ ������ ����Ʈ 
		int define = 0;//���� ��ȣ numbers�� ������
		String number;//bufferedreader�� �ֹι�ȣ ������ ��
		int allCount=0;//��ü �Է¼�
		int okCount =0;//���� �ֹι�ȣ ��
		int noCount =0;//�������� �ֹι�ȣ ��
		float okPer;//ok�ۼ�Ʈ
		float noPer;//no�ۼ�Ʈ
		System.out.println("=======================");
		System.out.println("�̷�ũ���� �ֹι�ȣ ���� �� ���� ���α׷�");
		System.out.println("\t\t-ȫ�浿");
		System.out.println("======================="); 
		System.out.println("�ֹι�ȣ �Է�(000000-0000000 ������ ���� 14�ڸ�,exit�Է½� ����)");		
		while(true) {
			System.out.print(">> ������ �Է�:");
			number = br.readLine();
			if(number.equals("exit")) {break;}
			try {
				numbers = new int[number.length()-1];
				for(int i=0;i<number.length();i++) {
					if(i==6){}
					else {
						if(i<6) {
							numbers[i] = Integer.parseInt(number.substring(i,i+1));//-�������� �տ�����	
						}else {
							numbers[i-1] = Integer.parseInt(number.substring(i,i+1));//-�������� �ڿ�����
						}
					}
				}//�ֹι�ȣ ���ڷ� ��ȯ ����
			} catch (Exception e) {System.out.println("-�� �����ϰ� ��� 0~9���� ���� �մϴ�");allCount++;continue;}//�ֹι�ȣ ���� Ʋ�� ��
			if(number.length()<14||number.length()>14) {
				System.out.println("�ֹι�ȣ�� ������ ���� 14�ڸ� �Դϴ�.");
				allCount++;
				continue;
			}//���ڰ� �ȸ��� ��
			int a=2;
			for(int i=0;i<12;i++) {
				define += a*numbers[i];
				a++;
				if(a>9) {a=2;}
			}//���� ���� �����
			define = (11 - (define%11));
			if(define == numbers[12]) {
				System.out.println("�������� �ֹι�ȣ�̸� ������ �����ϴ�.");
				allCount++;
				okCount++;
			}else {
				System.out.println("�ֹι�ȣ ��ġ�� ������ �ֽ��ϴ�.");
				allCount++;
				noCount++;
			}
		}//while��
		okPer = (100/allCount)*okCount;
		noPer = (100/allCount)*noCount;
		System.out.println("---------------------");
		System.out.println("�������:");
		System.out.println("-���� �ֹι�ȣ :"+okCount+"��("+okPer+"%)");
		System.out.println("-���� �ֹι�ȣ :"+noCount+"��("+noPer+"%)");
	}
}
