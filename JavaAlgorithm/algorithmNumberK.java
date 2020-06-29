package park.java.ex01;

public class algorithmNumberK {
/**
 * 문제 설명
배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.

예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면

array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
2에서 나온 배열의 3번째 숫자는 5입니다.
배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때, commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 solution 함수를 작성해주세요.

제한사항
array의 길이는 1 이상 100 이하입니다.
array의 각 원소는 1 이상 100 이하입니다.
commands의 길이는 1 이상 50 이하입니다.
commands의 각 원소는 길이가 3입니다.
입출력 예

array	commands	return
[1, 5, 2, 6, 3, 7, 4]	[[2, 5, 3], [4, 4, 1], [1, 7, 3]]	[5, 6, 3]

입출력 예 설명

[1, 5, 2, 6, 3, 7, 4]를 2번째부터 5번째까지 자른 후 정렬합니다. [2, 3, 5, 6]의 세 번째 숫자는 5입니다.
[1, 5, 2, 6, 3, 7, 4]를 4번째부터 4번째까지 자른 후 정렬합니다. [6]의 첫 번째 숫자는 6입니다.
[1, 5, 2, 6, 3, 7, 4]를 1번째부터 7번째까지 자릅니다. [1, 2, 3, 4, 5, 6, 7]의 세 번째 숫자는 3입니다.
 * 
 * 
 */
	public int [] result(int array[], int [][] commands) {
		int [] result = new int [commands.length];//결과
		for(int i=0; i<commands.length;i++) {//commads 만큼 반복
			int temp [] = new int [commands[i][1]-commands[i][0]+1];//정렬을 위한 임시 배열
			int a = 0;
			for(int j=commands[i][0]-1;j<commands[i][1];j++) {//command[i]의 첫번째 수부터 commands[i]의두번째 수만큼 반복
				temp[a] = array[j];//array값을 temp로 대입
				if(a != 0) {
					for(int k=0;k<a;k++) {
						if(temp[a]<temp[k]) {//작은 수 부터 나열하기 위한 조건
							int temp2 = temp[a];
							temp[a] = temp[k];
							temp[k] = temp2;
						}
					}
				}
				a++;
			}
			
			result[i] = temp[commands[i][2]-1];//commands의 마지막 숫자의 자리의 숫자 result에 추가
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		algorithmNumberK algorithm = new algorithmNumberK();
		int [] array = {1, 5, 2, 6, 3, 7, 4};
		int [][] commands = {{2, 5, 3},{4, 4, 1},{1, 7, 3}};
		int result [] = algorithm.result(array,commands);
		for(int i=0;i<result.length;i++) {
			System.out.println(i+1 + ":"+result[i]);
		}
	}

}
