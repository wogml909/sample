package _1100;

import java.util.Scanner;

public class _1155 {

	public static void main(String[] args) {
		// 자연수 입력 7의배수인지 확인한다
         Scanner sc = new Scanner(System.in);
         
         int a = sc.nextInt();

         if(a % 7 == 0) {
        	 System.out.println("multiple");
	}else
		System.out.println("not multiple");
  }
}
