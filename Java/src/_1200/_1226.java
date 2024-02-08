package _1200;

import java.util.Scanner;

public class _1226 {

	public static void main(String[] args) {
		// 로또문제
		// 7자리수 로또 7자리 번호 입력값을 받는다
		// 사용자 6자리 번호 입력값을 받는다

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[7];  //로또번호 자리
		int[] user = new int[6]; //사용자번호 자리
		int bonus = 0;

		int a = sc.nextInt();

		int count = 0;  //순위 초기화

		for (int i = 0; i <= 6; i++) { // 로또번호 받는다
			arr[i] = sc.nextInt(); // 입력을 7번 받는다
		}
		for (int j = 0; j <= 5; j++) { // 사용자번호 6번 받는다
			user[j] = sc.nextInt();
		}
		for (int i = 0; i <= 6; i++) { // 로또번호
			for (int j = 0; j <= 7; j++) { // 입력자번호
				if (arr[i] == user[j]) { // 로또번호 1,2,3,4~~비교해본다
					count++;
				} else {
					continue;
				}

			}
		}
		switch (count) {
		case 3:
			System.out.println("5");

		case 4:
			System.out.println("4");
		case 5:
			if (bonus == 7) {
				System.out.println("2");
			} else {
				System.out.println("3");
			}
		case 6:
			System.out.println("1");
		default:
			System.out.println("0");
		}
        sc.close();
	}
}