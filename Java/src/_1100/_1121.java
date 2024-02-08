package _1100;

import java.util.Scanner;

public class _1121 {
	public static void main(String[] args) {
		 //정수 계산에 나머지를 구하시오
		// 두 정수 a,b 를 입력받는다
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		//a 는 피제수, b는 제수를 나타낸다
		int c = a % b;
		System.out.println(c);
		//나머지를 출력한다
	}
}
