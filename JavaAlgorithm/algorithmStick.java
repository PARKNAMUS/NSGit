package park.java.ex01;

import java.util.ArrayList;
import java.util.Scanner;

public class algorithmStick {
	/*
	지민이는 길이가 64cm인 막대를 가지고 있다. 어느 날, 그는 길이가 Xcm인 막대가 가지고 싶어졌다. 
	지민이는 원래 가지고 있던 막대를 더 작은 막대로 자른다음에,
	 풀로 붙여서 길이가 Xcm인 막대를 만들려고 한다.
	막대를 자르는 가장 쉬운 방법은 절반으로 자르는 것이다. 지민이는 아래와 같은 과정을 거쳐서 막대를 자르려고 한다.
	1.지민이가 가지고 있는 막대의 길이를 모두 더한다. 처음에는 64cm 막대 하나만 가지고 있다. 이때, 합이 X보다 크다면, 아래와 같은 과정을 반복한다.
	2.가지고 있는 막대 중 길이가 가장 짧은 것을 절반으로 자른다.
	3.만약, 위에서 자른 막대의 절반 중 하나를 버리고 남아있는 막대의 길이의 합이 X보다 크거나 같다면, 위에서 자른 막대의 절반 중 하나를 버린다.
	4.이제, 남아있는 모든 막대를 풀로 붙여서 Xcm를 만든다.
	X가 주어졌을 때, 위의 과정을 거친다면, 몇 개의 막대를 풀로 붙여서 Xcm를 만들 수 있는지 구하는 프로그램을 작성하시오. 
		 * 
	 * 
	 * 
	 * */
	public static void main(String[] args) {
		int stickLength_temp = 64;
		int stickLength = 64;//처음 막대기 길이
		int sum = 0;
		int hopefulLength;//원하는 막대기 길이
		ArrayList<Integer> sticks = new ArrayList<Integer>();//막대기 조각 모음
		ArrayList<Integer> sticksNumber = new ArrayList<Integer>();//붙일 막대기 조각 모음
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 길이 입력: ");
		hopefulLength = sc.nextInt();

		while(stickLength>1) {
			sum = 0;//막대기 길이 총합 초기화
			sticksNumber = new ArrayList<Integer>();//붙일막대기 조각 모음 초기화
			if(hopefulLength < stickLength_temp) {//희망길이가 원래막대기와 같지 않을시
				stickLength = stickLength/2;	
				sticks.add(stickLength);
				sticks.add(stickLength);//막대기 분해 후 막대기 모음에 추가
			}else {//같을경우
				sticksNumber.add(stickLength);
				break;//붙일 모음에 막대기 길이 추가후 종료
			}
			for(int i=0;i<sticks.size()-1;i++) {
				sum += sticks.get(i);//막대기 모음 길이 더하기 
			}
			if(sum >= hopefulLength) {//sum이 원하는 길이보다 크거나 같을시
				sticks.remove(sticks.size()-1);//분해한 막대기중 하나 버림
				if(sum == hopefulLength) {//총 합계가 원하는 길이와 같을시
					sticksNumber = sticks;
					break;//붙일 막대기는 총 막대기 조각 대입 후 종료 
				}else {//총 합계가 원하는 길이와 다를시
					int sum_temp = 0;//현재 소유중인 막대기 조각들로 원하는 길이 조합위한 변수
					for(int i=0;i<sticks.size();i++) {
						if(sticks.get(i)<=hopefulLength) {//막대기 조각이 원하는 막대기보다 작을시
							sum_temp += sticks.get(i);//sum_temp에 조각 길이 더하기
							sticksNumber.add(sticks.get(i));//붙일 조각모음에 추가
							if(sum_temp == hopefulLength)break;// 만약 sum_temp가 원하는 길이와 같이지면 종료
							if(sum_temp>hopefulLength) {//만약 sum_temp가 원하는 길이보다 커질경우
								sum_temp-=sticks.get(i);//i번째막대기의 길이 빼주고
								sticksNumber.remove(sticksNumber.size()-1);//위에서 add한 막대기 제거
							}
						}
					}//
				}
			}
		}
		System.out.println("총이어붙인 막대기 수 : "+sticksNumber.size());
	}
}








