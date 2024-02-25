package _교재문제;

public class _교재129p_5 {

	public static void main(String[] args) {
		//반복문과 조건문을 사용하여 다음모양을 출력하라
		//* 다이아몬드
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
		
		for(int i = 1; i <= 3; i++) {
			//공백
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			
			//별표
			for (int j = 5; j >= (2*i-1); j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
