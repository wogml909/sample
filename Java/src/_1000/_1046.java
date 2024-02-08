package _1000;

import java.util.Scanner;

import javax.security.sasl.SaslClient;

public class _1046 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
   // 정수 3개를 입력받아 합과 평균을 출력하라
   // 단, -2147483648~+2147483647
	 Scanner sc = new Scanner(System.in);
	 int x = sc.nextInt();
	 int y = sc.nextInt();
	 int z = sc.nextInt();
	 
	 //합계, 평균
	 int sum = x + y + z;
	 double avg = (double)sum / 3;
	
	//합과 평균을 줄바꿔 출력한다
	//평균은 소수점 이하 둘째 자리에서 반올림해서 소수점 이하 첫자리까지 출력
	System.out.println(sum);
	System.out.printf("%.1f",avg);
	}
}
