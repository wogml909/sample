package _1500;

import java.util.Scanner;

public class _1503 {

	public static void main(String[] args) {
		// 지그재그문제

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[][] = new int[N][N];
		int a = 1;

		// 정방향
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = a++;
				}

			} else {
				// 역방향
				for (int j = arr[i].length - 1; j >= 0; j--) {
					arr[i][j] = a++;
				}

				System.out.println();
			}
		}

		// 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
			
			System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}