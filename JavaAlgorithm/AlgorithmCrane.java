package park.java.ex01;

import java.util.ArrayList;
import java.util.List;

public class AlgorithmCrane {
	/*
	 * 게임 화면은 1 x 1 크기의 칸들로 이루어진 N x N 크기의 정사각 격자이며 위쪽에는 크레인이 있고 오른쪽에는 바구니가 있습니다. 
	 * (위 그림은 5 x 5 크기의 예시입니다). 각 격자 칸에는 다양한 인형이 들어 있으며 인형이 없는 칸은 빈칸입니다. 
	 * 모든 인형은 1 x 1 크기의 격자 한 칸을 차지하며 격자의 가장 아래 칸부터 차곡차곡 쌓여 있습니다. 
	 * 게임 사용자는 크레인을 좌우로 움직여서 멈춘 위치에서 가장 위에 있는 인형을 집어 올릴 수 있습니다. 집어 올린 인형은 바구니에 쌓이게 되는 데,
	 *  이때 바구니의 가장 아래 칸부터 인형이 순서대로 쌓이게 됩니다
 		다음 그림은 [1번, 5번, 3번] 위치에서 순서대로 인형을 집어 올려 바구니에 담은 모습입니다.
	 * 
	 * 만약 같은 모양의 인형 두 개가 바구니에 연속해서 쌓이게 되면 두 인형은 터뜨려지면서 바구니에서 사라지게 됩니다. 
	 * 위 상태에서 이어서 [5번] 위치에서 인형을 집어 바구니에 쌓으면 같은 모양 인형 두 개가 없어집니다.
	 *크레인 작동 시 인형이 집어지지 않는 경우는 없으나 만약 인형이 없는 곳에서 크레인을 작동시키는 경우에는 아무런 일도 일어나지 않습니다. 
	 *또한 바구니는 모든 인형이 들어갈 수 있을 만큼 충분히 크다고 가정합니다. (그림에서는 화면표시 제약으로 5칸만으로 표현하였음)

	게임 화면의 격자의 상태가 담긴 2차원 배열 board와 인형을 집기 위해 크레인을 작동시킨 위치가 담긴 배열 moves가 매개변수로 주어질 때,
 	크레인을 모두 작동시킨 후 터트려져 사라진 인형의 개수를 return 하도록 solution 함수를 완성해주세요. 
	 * 
	 * 
	 * 입출력 예
board	moves	result
[[0,0,0,0,0],[0,0,1,0,3],[0,2,5,0,1],[4,2,4,4,2],[3,5,1,3,1]]	[1,5,3,5,1,2,1,4]	4
	 * 
	 * 
	 *
	
	 * */	
	public int solution(int[][] board,int[]crane) {
		int answer =0;//총터트린 인형
		List<Integer> bucket = new ArrayList<Integer>();//인형 담을 바구니
		for(int i=0;i<crane.length;i++) {
			for(int j=0;j<board.length;j++) {
				if(board[j][crane[i]-1] !=0) {
					if(bucket.size() != 0) {
						if(board[j][crane[i]-1] == bucket.get(bucket.size()-1)) {
							bucket.remove(bucket.size()-1);
							board[j][crane[i]-1] = 0;
							answer += 2;
							break;
						}
					}
					bucket.add(board[j][crane[i]-1]);
					board[j][crane[i]-1] = 0;
					break;
					
				}
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		int [][]board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int []crane = {1,5,3,5,1,2,1,4};
		AlgorithmCrane algorithm = new AlgorithmCrane();
		int answer = algorithm.solution(board, crane);
		System.out.println(answer);
	}
}
