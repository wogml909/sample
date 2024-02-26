package _1500;

import java.util.Scanner;

public class _1508 {

	public static void main(String[] args) {
		/*
		 * 순서도
		 * 1. 정수 N을 입력받는다
		 * 2. N행 N열의 2차원 배열을 생성한다
		 * 3. N번 반복하여, N개의 정수를 배열의 J+1 번째 부터 순서대로 값을 계산한다
		 * 4. 배열을 아래의 반복변수 i,j로 반복한다
		 * i : 1~(N-1)
		 * j : 1~i
		 * arr[i][j] = arr[i][j-1]  - arr[i-1][j-1]
		 * 수식으로 연산하여, 빈칸에 대입한다
		 * 5.배열을 반복하여 값이 있는 부분만 출력한다
		 */
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[][] = new int [N][N];
		for (int i = 0; i < arr.length; i++) {
			arr[i][0] = sc.nextInt();           //i는 고정값
		}
		
		//i:1~(n-1)
		//j:1~i
		//수식계산
		for (int i = 1; i < N; i++) {
			for (int j = 1; j <= i; j++) {
				arr[i][j]= arr[i][j-1] - arr[i-1][j-1];
			}
		}
		
		//출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
       
	}

}
