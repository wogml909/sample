package DAY03;

import java.util.Scanner;

public class Ex16_loof {

	public static void main(String[] args) {
// TODO Auto-generated method stub
  //무한루프
		// : 반드시 종료조건을 추가해주어야 한다
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("입력 : ");
			String str = sc.nextLine();
			
			//문자열.equals("비교문자열")
			if( str.equals("STOP")){
				break;
			}
			System.out.println(">>" + str);
			
		}
		System.out.println("프로그램을 종료합니다");
		sc.close();
	}

}
