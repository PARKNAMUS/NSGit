package park.java.ex01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

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
		Map<String,Integer> players = new HashMap<String, Integer>();
		for(String person:participant) {
			players.put(person, players.getOrDefault(person, 0)+1);
		}
		for(String person:completion) {
			players.put(person, players.get(person)-1);
		}
		for(String person:players.keySet()) {
			if(players.get(person) != 0) {
				answer = person;
			}
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
