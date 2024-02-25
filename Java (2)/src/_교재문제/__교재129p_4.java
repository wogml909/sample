package _교재문제;

public class __교재129p_4 {

	public static void main(String[] args) {
		// 반복문을 사용하여 다음 모양을 출력하는 프로그램을 만드시오
		//* 삼각형
		for(int i = 1; i <= 4; i++) {
			//공백
			for (int j = 3; j >= i; j--) {
				System.out.print(" ");
			}
			
			//별표
			for (int j = 1; j <= (2*i-1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
