package DAY03;

import java.util.Scanner;

public class Ex01_If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc = new Scanner(System.in);
          
          System.out.println("정수 입력 :");
         int num = sc.nextInt();
         
         //입력받은 값이 홀수인지, 짝수인지 판단하시오.
         //홀수, 짝수 조건?
         if(num % 2 == 1) {
        	 System.out.println("홀수입니다.");
         }else {
        	 System.out.println("짝수입니다.");
         }
         sc.close();
	}

}
