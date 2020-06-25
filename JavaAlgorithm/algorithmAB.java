package park.java.ex01;

import java.util.Scanner;

public class algorithmAB {
/*
 * 재용이는 최신 컴퓨터 10대를 가지고 있다. 어느 날 재용이는 많은 데이터를 처리해야 될 일이 생겨서 각 컴퓨터에 1번부터 10번까지의 번호를 부여하고, 
 * 10대의 컴퓨터가 다음과 같은 방법으로 데이터들을 처리하기로 하였다.
1번 데이터는 1번 컴퓨터, 2번 데이터는 2번 컴퓨터, 3번 데이터는 3번 컴퓨터, ... ,
10번 데이터는 10번 컴퓨터, 11번 데이터는 1번 컴퓨터, 12번 데이터는 2번 컴퓨터, ...
총 데이터의 개수는 항상 a^b개의 형태로 주어진다. 재용이는 문득 마지막 데이터가 처리될 컴퓨터의 번호가 궁금해졌다. 이를 수행해주는 프로그램을 작성하라.
 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A;//숫자
		int B;//A에 제곱할 숫자
		int data = 0;//데이터 개수
		int result = 0;//마지막 데이터 수
		System.out.print("A입력: ");
		A = sc.nextInt();
		System.out.print("B입력: ");
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
		System.out.println("마지막 데이터 : "+result);
	}
}
