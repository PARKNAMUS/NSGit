package park.java.ex01;

public class AlgorithmPhoneNumber {
/*
 * 문제 설명


전화번호부에 적힌 전화번호 중, 한 번호가 다른 번호의 접두어인 경우가 있는지 확인하려 합니다.
전화번호가 다음과 같을 경우, 구조대 전화번호는 영석이의 전화번호의 접두사입니다.
•구조대 : 119
•박준영 : 97 674 223
•지영석 : 11 9552 4421

전화번호부에 적힌 전화번호를 담은 배열 phone_book 이 solution 함수의 매개변수로 주어질 때, 
어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true를 return 하도록 solution 함수를 작성해주세요.

제한 사항
•phone_book의 길이는 1 이상 1,000,000 이하입니다.
•각 전화번호의 길이는 1 이상 20 이하입니다.
[“119”, “97674223”, “1195524421”] false 
[“123”,“456”,“789”] true 
[“12”,“123”,“1235”,“567”,“88”] false 


 * 
 * */
	public boolean solution(String[] phone_book) {
        boolean answer = true;
        for(int i=0;i<phone_book.length ; i++) {
    		for(int j=0;j<phone_book.length;j++) {
    			if(i!=j) {//비교대상이 다를시
	    			if(phone_book[i].length()<phone_book[j].length()) {//현재번호가 비교대상보다 작을시
	    				int phoneLength = phone_book[i].length();//현재 번호의 길이
	    				if(phone_book[j].substring(0,phoneLength).equals(phone_book[i])) {//비교대상의 접두어가 현재번호일경우
	    					answer =false;//answer false
	    					break;//종료
	    				}
	    			}else if(phone_book[i].length() == phone_book[j].length()) {//현재번호와 비교대상의 길이가 같을시
	    				if(phone_book[i].equals(phone_book[j])) {//현재번호와 비교대상이 같으면
	    					answer = false;//answer false 
	    					break;//종료
	    				}
	    			}
    			}
    			if(!answer) break;
    		}
    		if(!answer)break; //answer 가 false 일경우 종료
        }
        return answer;
       
    }
	public static void main(String[] args) {
		String [] phone_book = {"119","97674223","1195524421"};
		AlgorithmPhoneNumber algorithm = new AlgorithmPhoneNumber();
		System.out.println(algorithm.solution(phone_book));
	}
}
