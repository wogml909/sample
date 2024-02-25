package Day07.Review;

import java.util.Scanner;

public class Ex01_Multiple {

	//main : ctrl + space
	//-프로그램 실행 시 가장 먼저 실행되는 메소드
	public static void main(String[] args) {
		//정수하나를 입력받아서
		//입력받은 수가 3의 배수인지 아닌지 
		//판단하고 그 여부를 출력하는 프로그램을 작성하시오
		//3의 배수면 "3의 배수입니다"
		//3의 배수가 아니면 "3의 배수가 아닙니다."
		
		//1. 정수입력
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); 
		
		//2.3의 배수인지 판단
		if(N % 3 == 0) {
			System.out.print("3의 배수입니다.");
		}else {
			System.out.print("3의 배수가 아닙니다.");
		}
		System.out.println();
		

		sc.close();
	}
}
