package DAY03;

import java.util.Iterator;

public class Ex12_For {

	public static void main(String[] args) {
		// for(1초기식 ; 2조건식 ;4증감식) {3실행문;}
		// -실행순서:1->반복(2 → 3 → 4)
        //1. 1~10까지의 정수를 출력하시오
		for (int i = 0; i < args.length; i++) {
		 System.out.print(i + " ");	
		}
		System.out.println();
		
		//2. 50~100까지 정수를 출력하시오
		
		for(int i = 50; i <= 100; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		//3. 1~20까지의 정수 중 홀수만 출력하시오
		for(int i = 2; i <= 20; i+=2) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		//4. 1~20까지의 정수 중 짝수만 출력하시오
		for(int i = 1; i <= 20; i+=2) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
