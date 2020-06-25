package park.java.ex01;

import java.util.HashMap;
import java.util.Scanner;

public class algorithmTournament {
/*
 * �������� N���� �����ϴ� ��Ÿ ��ʸ�Ʈ�� �����ߴ�. ��ʸ�Ʈ�� ������ ���� ����ȴ�. �ϴ� N���� �����ڴ� ��ȣ�� 1������ N������ �����޴´�.
 *  �׷��� �� �Ŀ� ���� ������ ��ȣ���� ��Ÿ�� �Ѵ�. �̱� ����� ���� ���忡 �����ϰ�, �� ����� �� ���忡�� ��������. 
 *  ���� �� ������ �����ڰ� Ȧ�����̶��, ������ ��ȣ�� ���� �����ڴ� ���� ����� �ڵ� �����Ѵ�. 
 *  ���� ���忡�� �ٽ� �������� ��ȣ�� 1������ �ű��. �̶�, ��ȣ�� �ű�� ������ ó�� ��ȣ�� ������ �����ϸ鼭 1������ �ű��. 
 *  �� ���� 1���� 2���� ��Ÿ�� �ؼ� 1���� �����ϰ�, 3���� 4���� ��Ÿ�� �ؼ� 4���� �����ߴٸ�, 4���� ���� ���忡�� ��ȣ 2���� �����޴´�. 
 *  ��ȣ�� �ٽ� �������� �Ŀ� �� �� ���� ������ ���带 ��� �Ѵ�.

��ħ �� ��Ÿ ��ȸ�� ���Ѽ��� �����ߴ�. �������� ���ڱ� ��Ÿ ��ȸ���� ����ϴ� ����� ��������, �� ���忡�� ���Ѽ��� ����ϴ��� �ñ�������. 
�ϴ� �����ΰ� ���Ѽ��� ���� ����ϱ� ������ �׻� �̱�ٰ� �����Ѵ�. 
1 ���忡�� �������� ��ȣ�� ���Ѽ��� ��ȣ�� �־��� ��, ���� �����ΰ� ���Ѽ��� �� ���忡�� ����ϴ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

 * */
	public static void main(String[] args) {
		int playersNum;//�� ���� ��
		int gimin;//ó�� ������ ��ȣ
		int hansu;//ó�� �Ѽ��� ��ȣ
		int round = 1;//���� ����
		int matchRound = -1;//���ΰ� �Ѽ��� ����
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ��: ");
		playersNum = sc.nextInt();
		System.out.print("ó�� ������ ��ȣ: ");
		gimin = sc.nextInt();
		System.out.print("ó�� �Ѽ��� ��ȣ: ");
		hansu = sc.nextInt();
		while(playersNum > 1) {
			int [][] players;
			int number = 1;
			if(playersNum %2 ==0) {
				players = new int[playersNum/2][2];
			}else {
				players = new int[playersNum/2+1][2];
			}
			for(int i=0; i<players.length; i++) {
				for(int j=0;j<2;j++) {
					if(i == players.length-1 && playersNum%2 !=0 &&j==1) {
						players[i][j] = -1;
					}
					players[i][j] = number;
					number++;
					if(j==1) {
						if(players[i][j] == gimin || players[i][j] == hansu) {
							if(players[i][j-1] == gimin || players[i][j-1] == hansu) {
								matchRound = round;
								
							}
						}
					}
				}
			}
			if(playersNum %2 ==0) {
				playersNum = playersNum/2;
			}else {
				playersNum = playersNum/2+1;
			}
			if(gimin %2 == 0) {
				gimin = gimin/2;
				
			}else {
				gimin = gimin/2+1;
			}
			if(hansu %2 == 0) {
				hansu = hansu/2;
			}else {
				hansu = hansu/2+1;
			}
			round++;
		}
		System.out.println("���ΰ� �Ѽ��� ����: "+matchRound);
	}
}
