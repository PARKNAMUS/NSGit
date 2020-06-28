package park.java.ex01;

import java.util.Scanner;

public class algorithmEscapeAtRectangle {

	/*
	 * 한수는 지금 (x, y)에 있다. 직사각형의 왼쪽 아래 꼭짓점은 (0, 0)에 있고, 오른쪽 위 꼭짓점은 (w, h)에 있다. 
	 * 직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.
	 *
	 * 첫째 줄에 x y w h가 주어진다.
	 *  w와 h는 1,000보다 작거나 같은 자연수이고, x는 1보다 크거나 같고, 
	 *  w-1보다 작거나 같은 자연수이고, y는 1보다 크거나 같고,
	 *   h-1보다 작거나 같은 자연수이다.
	 * 
	 * */
	public static void main(String[] args) {
		int x;//x좌표
		int y;//y좌표
		int w;//w좌표
		int h;//h좌표
		int [] arr = new int [4];
		int min = 0;//최소거리 구하기위해
		Scanner sc = new Scanner(System.in);
		System.out.print("x(1보다 크거나 같고 w-1보다 작거나 같은 자연수) :");
		x = sc.nextInt();
		System.out.print("y((1보다 크거나 같고 h-1보다 작거나 같은 자연수)) :");
		y = sc.nextInt();
		System.out.print("w(1000보다 작거나 같은 자연수) :");
		w = sc.nextInt();
		System.out.print("h(1000보다 작거나 같은 자연수) :");
		h = sc.nextInt();
		
		arr[0] = w-x;//x좌표부터 w좌표까지의 거리
		arr[1] = x;//x좌표부터 0(밑경계) 까지의 거리
		arr[2] = h-y;//y좌표부터 h좌표까지의 거리
		arr[3] = y;//y좌표부터 0까지의 거리
		
		
		for(int i=0;i<arr.length;i++) {//반복하며 최소길이 구함
			if(i<arr.length-1) {
				if(arr[i]>arr[i+1]) {
					min = arr[i+1];
				}else {
					min = arr[i];
				}
			}
		}
		System.out.println("직사각형 경계까지의 최소거리: "+min);
	}
}
