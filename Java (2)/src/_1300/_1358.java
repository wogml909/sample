package _1300;

import java.util.Scanner;

public class _1358 {

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
