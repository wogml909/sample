package Day07.Review;

import java.util.Scanner;

public class Ex02_ThreeSixNine {
  
	public static void main(String[] args) {
		//정수 1~100까지 수를 반복하면서
		//해당 수가 3 또는 6 또는 9가될때
		//369의 개수 만큼 정수대신 "*"를 출력하는 프로그램을 작성하시오
		//예 ) 3 --> "*" 
		//    33 ->"**"
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		
		//1.정수를 1~100반복문만들기
		//2-1. 해당수가 369인지 여부(A)판단 
		//2-2. 해당수가 369인지 여부(B)판단 
		//2-3. A B = ture 면"**"
		//3. 그 개수만큼 "*"출력
		for (int i = 1; i <= 100; i++) {
			//십의자리수:해당수(i)/10(정수부분만)
			int ten = i / 10;
			//일의자리수 :해당수(i) % 10
//			int one = i % 10;
//			boolean ten369 = false;
//			boolean one369 = false;
			int one = i % 10;
			//boolean ten369 = ten == 3 || ten == 6 || ten == 9;
			boolean ten369 = (ten != 0) && (ten % 3 == 0);
			//boolean one369 = one == 3 || one == 6 || one == 9;
			boolean one369 = (one != 0) && (one % 3 == 0);
//			if( ten == 3 || tem == 6 || ten == 9)
//			   ten = true;
//			if( one == 3 || one == 6 || one == 9)
//				one = true;
			if(ten369 && one369)
				System.out.println("**");
			else if(ten369 || one369)
				System.out.println("*");
			else
				System.out.println(i);
		}
	}
}
