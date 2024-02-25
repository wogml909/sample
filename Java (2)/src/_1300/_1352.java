package _1300;

import java.util.Scanner;

public class _1352 {

	public static void main(String[] args) {
		// 사각형의 길이 n이 입력된다

		 Scanner sc = new Scanner(System.in);
		 int a = sc.nextInt();
		 
		 for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= a; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
    sc.close();
	}
}
