package park.java.test;

public class DecimalCheck {
	
	public static void main(String[] args) {
		
		int isSosu=0;//�״��0�ϰ�� �Ҽ�
		int minSosu=0;//�ּҼҼ�
		int maxSosu=0;//�ִ�Ҽ�
		int sosuCount=0;//���Ҽ�����
		int random_num;//�������� 100��
		System.out.println("=======================");
		System.out.println("�̷�ũ���� �Ҽ� �Ǵ� ���α׷�");
		System.out.println("\t-ȫ�浿");
		System.out.println("=======================");
		for(int i=0;i<100;i++) {
			isSosu = 0;
			random_num = (int)(Math.random()*1000)+1;
			for(int j=2;j<=9;j++) {
				if(random_num%j==0) {
					isSosu++;
				}
			}//�Ҽ����� Ȯ��
			if(isSosu==0) {
				System.out.println("�Ҽ� �߰�: "+random_num);
				sosuCount++;
				if(minSosu==0) {//ó�� �߽߰ô� �׳� ����
					maxSosu = random_num;
					minSosu = random_num;
				}else {
					if(maxSosu<random_num) {maxSosu = random_num;}//���� �ִ�Ҽ��� ���簪���� �������
					if(minSosu>random_num) {minSosu=random_num;}//���� �ּҼҼ��� ���簪���� Ŭ���
				}
			}//�Ҽ��� ���
		}
		System.out.println("-------------------");
		System.out.println("�������");
		System.out.println("�ּҼҼ�: "+minSosu);
		System.out.println("�ִ�Ҽ�: "+maxSosu);
		System.out.println("�Ҽ��� ����: "+sosuCount);
	}
}
