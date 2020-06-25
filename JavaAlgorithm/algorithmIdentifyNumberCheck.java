package park.java.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IdentifyNumberCheck{
	
	public static void main(String[] args) throws Exception{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int numbers [];//번호 저장할 리스트 
		int define = 0;//검증 번호 numbers의 마지막
		String number;//bufferedreader로 주민번호 저장할 곳
		int allCount=0;//전체 입력수
		int okCount =0;//맞은 주민번호 수
		int noCount =0;//맞지않은 주민번호 수
		float okPer;//ok퍼센트
		float noPer;//no퍼센트
		System.out.println("=======================");
		System.out.println("미래크립토 주민번호 검증 및 집계 프로그램");
		System.out.println("\t\t-홍길동");
		System.out.println("======================="); 
		System.out.println("주민번호 입력(000000-0000000 하이픈 포함 14자리,exit입력시 종료)");		
		while(true) {
			System.out.print(">> 데이터 입력:");
			number = br.readLine();
			if(number.equals("exit")) {break;}
			try {
				numbers = new int[number.length()-1];
				for(int i=0;i<number.length();i++) {
					if(i==6){}
					else {
						if(i<6) {
							numbers[i] = Integer.parseInt(number.substring(i,i+1));//-기준으로 앞에숫자	
						}else {
							numbers[i-1] = Integer.parseInt(number.substring(i,i+1));//-기준으로 뒤에숫자
						}
					}
				}//주민번호 숫자로 변환 과정
			} catch (Exception e) {System.out.println("-을 제외하고 모두 0~9숫자 여야 합니다");allCount++;continue;}//주민번호 형식 틀릴 시
			if(number.length()<14||number.length()>14) {
				System.out.println("주민번호는 하이픈 포함 14자리 입니다.");
				allCount++;
				continue;
			}//숫자가 안맞을 시
			int a=2;
			for(int i=0;i<12;i++) {
				define += a*numbers[i];
				a++;
				if(a>9) {a=2;}
			}//검증 숫자 변경법
			define = (11 - (define%11));
			if(define == numbers[12]) {
				System.out.println("정상적인 주민번호이며 오류가 없습니다.");
				allCount++;
				okCount++;
			}else {
				System.out.println("주민번호 수치상 오류가 있습니다.");
				allCount++;
				noCount++;
			}
		}//while끝
		okPer = (100/allCount)*okCount;
		noPer = (100/allCount)*noCount;
		System.out.println("---------------------");
		System.out.println("최종결과:");
		System.out.println("-정상 주민번호 :"+okCount+"건("+okPer+"%)");
		System.out.println("-정상 주민번호 :"+noCount+"건("+noPer+"%)");
	}
}
