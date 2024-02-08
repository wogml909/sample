package _1000;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// 지그재그

		// 1.입력값을 받는다

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[][] = new int[N][N]; // 배열(여러데이터 저장) 생성자 생성해서 입력값을 넣어준다 생성자는 각각의 주소값을 갖는다
		int a = 1; // 초기화

		// 2.범위지정
		for (int i = 0; i < arr.length; i++) { // 큰 범위 지정 : 입력값이 i보다 크면 증감한다
			// 정방향
			if (i % 2 == 0) {// 작은 범위 지정 : i가 짝수이면

				for (int j = 0; j < arr[i].length; j++) { // j가 i의길이보다 작으면 아래 조건이 성립하면 j는 증가한다
					arr[i][j] = a++; // 배열 arr가 증가한다 a값은 초기화한다
				}
				// 역방향
			} else {
				for (int j = arr[i].length - 1; j >= 0; j--) {// i의 길이가 1씩 작아지고 0보다 크면 아래조건 성립되면 차감된다
					arr[i][j] = a++; // 배열 arr가 증가한다 
				}
				System.out.println();
			}

		}
		// 츨력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "");
			}
			System.out.println();
		}
	}
}
