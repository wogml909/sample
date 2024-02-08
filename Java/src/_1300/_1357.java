package _1300;

import java.util.Scanner;

public class _1357 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       
       //정방향 삼각형
       for (int i = 1; i <= n; i++) {
	    for (int j = 1; j <= i; j++) {
			System.out.print("*");
		}
	    System.out.println();
	}
       
       //역방향 삼각형
       for (int i = 1; i <= n-1; i++) {
		for (int j = n-1; j >= i; j--) {
			System.out.print("*");
		}
		System.out.println();
	}
       sc.close();
	}

}
