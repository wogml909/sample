package _1100;

import java.util.Scanner;

public class _1149 {

	public static void main(String[] args) {
        // 두 정수가 입력된다
	   Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
				
		// 두 정수중 큰 정수를 출력한다
		if(a > b ) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}
	}

}
