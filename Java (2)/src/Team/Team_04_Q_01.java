package Team;

import java.util.Scanner;

public class Team_04_Q_01 {

	public static void main(String[] args)  {
		// 학생의영어, 수학,자바 성적 을각각
		// 정수형 변수eng, math, java 로선언하고
		// , 순서대로점수를입력받아성적의총합
		// 계와평균을계산하여출력하는프로그램을작성하시오.
		// 입력 80 90 100

		Scanner sc = new Scanner(System.in);

		int eng = sc.nextInt();
		int math = sc.nextInt();
		int java = sc.nextInt();
		int avg = eng + math + java;

		System.out.println("영어 점수 : " + eng);
		System.out.println("수학 점수 : " + math);
		System.out.println("자바 점수 : " + java);

		System.out.println("총점 : " + (eng + math + java));

		System.out.printf("평균 : %.1f\n", (double) avg / 3);

		sc.close();

	}

}
