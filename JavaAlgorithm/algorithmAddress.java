package park.java.ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class algorithmAddress {
/**
 * 재석이는 대문에 붙이는 (주소를 나타내는) 호수판 제작업체의 직원이다.
 *  고객에게 전달할 호수판은 숫자와 숫자 사이 그리고 왼쪽 오른쪽으로 
 *  적당히 여백이 들어가 줘야하고 숫자마다 차지하는 간격이 조금씩 상이하다.
 *   다행이도 규칙은 매우 간단하다. 
1.각 숫자 사이에는 1cm의 여백이 들어가야한다.
2.1은 2cm의 너비를 차지해야한다. 0은 4cm의 너비를 차지해야한다. 나머지 숫자는 모두 3cm의 너비를 차지한다.
3.호수판의 경계와 숫자 사이에는 1cm의 여백이 들어가야한다.
 * 재석이는 고객에게 전달해야할 호수판의 너비가 얼마나 되는지 궁금해졌다. 재석이를 도와주자!
 */
	public static void main(String[] args) {
		String address;//주소
		int width = 0;//호수판의 너비
		Scanner sc = new Scanner(System.in);
		System.out.print("주소: ");
		address = sc.nextLine();
		for(int i=0;i<address.length();i++) {
			if(address.charAt(i)-48 == 1) {//주소 글자가 1 일경우
				width += 2;
			}else if(address.charAt(i)-48 == 0) {//주소글자가 0 일경우
				width += 4;
			}else {
				width += 3;
			}
		}
		width+=(address.length() +1);//여백 합
		System.out.println("호수판의 너비: "+width);
	}
}
