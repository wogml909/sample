package Team;

import java.util.List;
import java.util.Scanner;

public class Team_04_Q02 {

	public static void main(String[] args) {
//		정수하나를입력받아, 정수형변수N에 초기화시키고, 
//		정수1부터N까지홀수의합계와짝수의합계그리고
//		정수N의약수를구하여예시<출력>과 같이출력하는프로그램을작성하시오. 
//		( 1 ≤ N ≤ 100 )
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a = 0; // 홀수
		int b = 0; // 짝수
		int count = 0;

		for (int i = 0; i <= N; i++) { // 입력값의 번위 1~10
			if (i % 2 != 0) { // 짝수일때
				a += i;
			} else { // 홀수일때
				b += i;
			}
		}
		System.out.println("1+3+5+7+9=" + a);
		System.out.println("2+4+6+8+10=" + b);

		for (int i = 1; i <= N; i++) {
			if (N % i == 0) {             //약수출력
				System.out.print(i + " ");
			}
		}

	}

}