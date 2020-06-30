package park.java.ex01;

import java.util.HashMap;

public class AlgorithmMaraton {
/*
 * ������ ������ �������� �����濡 �����Ͽ����ϴ�. �� �� ���� ������ �����ϰ�� ��� ������ �������� �����Ͽ����ϴ�.

�����濡 ������ �������� �̸��� ��� �迭 participant�� ������ �������� �̸��� ��� �迭 completion�� �־��� ��, 
�������� ���� ������ �̸��� return �ϵ��� solution �Լ��� �ۼ����ּ���.

���ѻ���
������ ��⿡ ������ ������ ���� 1�� �̻� 100,000�� �����Դϴ�.
completion�� ���̴� participant�� ���̺��� 1 �۽��ϴ�.
�������� �̸��� 1�� �̻� 20�� ������ ���ĺ� �ҹ��ڷ� �̷���� �ֽ��ϴ�.
������ �߿��� ���������� ���� �� �ֽ��ϴ�.

����� ��

participant	completion	return
[leo, kiki, eden]	[eden, kiki]	leo
[marina, josipa, nikola, vinko, filipa]	[josipa, filipa, marina, nikola]	vinko
[mislav, stanko, mislav, ana]	[stanko, ana, mislav]	mislav
����� �� ����
���� #1
leo�� ������ ��ܿ��� ������, ������ ��ܿ��� ���� ������ �������� ���߽��ϴ�.

���� #2
vinko�� ������ ��ܿ��� ������, ������ ��ܿ��� ���� ������ �������� ���߽��ϴ�.

���� #3
mislav�� ������ ��ܿ��� �� ���� ������, ������ ��ܿ��� �� ��ۿ� ���� ������ �Ѹ��� �������� ���߽��ϴ�.
 * */
	public String solution(String [] participant, String [] completion) {
		String answer = "";
		HashMap<String, String> maratoners = new HashMap<String, String>();
		
		for(int i=0;i<participant.length;i++) {
			for(int j=0;j<completion.length;j++) {
				if(participant[i].equals(completion[j])) {
					maratoners.put(participant[i], "success");
					break;
				}
				if(j== completion.length-1 && !participant[i].equals(completion[j])) {
					maratoners.put(participant[i], "fail");
				}
			}
		}
		
		for(int i=0; i<maratoners.size();i++) {
			if(maratoners.get(participant[i]).equals("fail"))answer = participant[i];
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		String [] participant = {"lee","park","kim","han"};
		String [] completion = {"lee","park","han"};
		AlgorithmMaraton algorithm = new AlgorithmMaraton();
		String answer = algorithm.solution(participant, completion);
		System.out.println(answer);
	}
}
