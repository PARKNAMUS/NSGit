package park.java.ex01;

public class Algorithm124 {
	/*
	 * 124 ���� �ֽ��ϴ�. 124 ���󿡼��� 10������ �ƴ� ������ ���� �ڽŵ鸸�� ��Ģ���� ���� ǥ���մϴ�.

124 ���󿡴� �ڿ����� �����մϴ�.
124 ���󿡴� ��� ���� ǥ���� �� 1, 2, 4�� ����մϴ�.
���� �� 124 ���󿡼� ����ϴ� ���ڴ� ������ ���� ��ȯ�˴ϴ�.

10����	124 ����	10����	124 ����
1	1	6	14
2	2	7	21
3	4	8	22
4	11	9	24
5	12	10	41
�ڿ��� n�� �Ű������� �־��� ��, n�� 124 ����
���� ����ϴ� ���ڷ� �ٲ� ���� return �ϵ��� solution �Լ��� �ϼ��� �ּ���.
	 * */
    public String solution(int n) {
        String answer = "";
        int div = -1;
        int per = -1;
        int nums[] = new int[]{1,2,4};
        StringBuffer buffer = new StringBuffer();
        while(true) {
        	
        	div = (n-1)/3;
        	per = (n-1)%3;
        	buffer.append(nums[per]);
        	n = div;
        	if(div == 0) {
        		break;
        	}
        	
        }
        answer = buffer.reverse().toString();
        return answer;
    }
    public static void main(String[] args) {
		Algorithm124 algorithm = new Algorithm124();
		System.out.println(algorithm.solution(10));
		
	}
}
