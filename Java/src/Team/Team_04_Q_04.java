package Team;

import java.util.Scanner;

public class Team_04_Q_04 {
	// 정수하나를입력받아,
	// 정수형변수N에 초기화시키고,
	// 예시<출력>과같이“*” 기호를출력하는프로그램을작성하시오.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    
    for (int i = 1; i <= n; i++) {
		//공백출력
    	for (int j = n; j > i; j--) {
			System.out.print(" ");
		}
    	
    	//별 출력
    	for (int j = 1; j <= (2*i-1); j++) {
			System.out.print("*");
		}
    	System.out.println();
	}
    sc.close();
    }

}