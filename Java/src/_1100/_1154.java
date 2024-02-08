package _1100;

import java.util.Scanner;

public class _1154 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //정수 두개가 입력으로 들어오면 큰수 - 작은수의 값을 출력하시오
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

	    if(a>b) {
	    	System.out.println(a-b);
	    }else 
		    System.out.println(b-a);
        }
}
