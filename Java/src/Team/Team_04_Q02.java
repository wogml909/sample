package Team;

import java.util.Scanner;

public class Team_04_Q02 {

	public static void main(String[] args) {
//		정수하나를입력받아, 정수형변수N에 초기화시키고, 
//		정수1부터N까지홀수의합계와짝수의합계그리고
//		정수N의약수를구하여예시<출력>과 같이출력하는프로그램을작성하시오. 
//		( 1 ≤ N ≤ 100 )

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] num = new int[5];
		
		while (N <= 9) { // 10까지 범위
			if (N % 2 != 0) { // 홀수이면
			//	int num = num + 1;
				System.out.print(num);
			}else {
			//	int num = num + 2;
				System.out.print(num);
			}
		}

	}
}