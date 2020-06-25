package park.java.test;

public class DecimalCheck {
	
	public static void main(String[] args) {
		
		int isSosu=0;//그대로0일경우 소수
		int minSosu=0;//최소소수
		int maxSosu=0;//최대소수
		int sosuCount=0;//모든소수개수
		int random_num;//랜덤숫자 100개
		System.out.println("=======================");
		System.out.println("미래크립토 소수 판단 프로그램");
		System.out.println("\t-홍길동");
		System.out.println("=======================");
		for(int i=0;i<100;i++) {
			isSosu = 0;
			random_num = (int)(Math.random()*1000)+1;
			for(int j=2;j<=9;j++) {
				if(random_num%j==0) {
					isSosu++;
				}
			}//소수인지 확인
			if(isSosu==0) {
				System.out.println("소수 발견: "+random_num);
				sosuCount++;
				if(minSosu==0) {//처음 발견시는 그냥 대입
					maxSosu = random_num;
					minSosu = random_num;
				}else {
					if(maxSosu<random_num) {maxSosu = random_num;}//이전 최대소수가 현재값보다 작을경우
					if(minSosu>random_num) {minSosu=random_num;}//이전 최소소수가 현재값보다 클경우
				}
			}//소수일 경우
		}
		System.out.println("-------------------");
		System.out.println("최종결과");
		System.out.println("최소소수: "+minSosu);
		System.out.println("최대소수: "+maxSosu);
		System.out.println("소수의 개수: "+sosuCount);
	}
}
