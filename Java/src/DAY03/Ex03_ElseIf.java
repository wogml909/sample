package DAY03;

import java.util.Scanner;

public class Ex03_ElseIf {

	public static void main(String[] args) {
		// 학생의 성적을 입력받고, 성적에 따라 학점을 출력하시오
		//90점이상, A
		//80점이상, B
		//70점이상, C
		//60점이상, D
		//60점미만, F
		Scanner sc = new Scanner(System.in);
		System.out.println("성적 : ");
		int score = sc.nextInt();
		char grade = 'F';
		
	    //if만~	
//		if(score > 90 && score <= 100)
//			System.out.println("학점 : A");
//		if(score > 80 && score <= 90) 
//			System.out.println("학점 : B");
//		if(score > 70 && score <= 80) 
//			System.out.println("학점 : C");
//		if(score > 60 && score <= 70) 
//			System.out.println("학점 : D");	
//		if(score < 60 && score >= 0) 
//			System.out.println("학점 : F");
		
		//한줄로 ~ 따로 전부 검사 :단일선택
//		if(score >= 90 && score <= 100) grade = 'A';
//		if(score >= 80 && score < 90) grade = 'B';
//		if(score >= 70 && score < 80) grade = 'C';
//		if(score >= 60 && score < 70) grade = 'D';
//		if(score > 90 && score >= 0) grade = 'F';
//		System.out.println("학점 : " + grade);
		
		//if~else if~else 무조건 1개는 실행된다 :다중선택
		if(score >=90&& score <=100)
			grade = 'A';
		else if(score >=80) 
			grade ='B';
		else if(score >=70) 
			grade ='C';
		else if(score >=60) 
			grade ='D';
		else  
			grade ='F';
		System.out.println("학점 : " + grade);

       sc.close();
 }
}