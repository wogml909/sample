package Day05.Ex01_Student;

public class StudentEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();

		// Student의 변수에 접근하여, name,age,stuNo,major값을 지정해보시오
		student.name = "김조은";
		student.age = 20;
		student.stdNo = "T100200";
		student.major = "컴퓨터공학과";
		int scores[] = {100, 80, 90, 50, 75};

		System.out.println("### 학생1 ####");
		System.out.println("학생1 - 이름 : " + student.name);
		System.out.println("학생1 - 나이: " + student.age);
		System.out.println("학생1 - 학번 : " + student.stdNo);
		System.out.println("학생1 - 전공 : " + student.major);
		
		student.study("자바 프로그래밍");
		System.out.println("학생1 - 중간고사 점수 : " + student.getAverage(10, 90));
		System.out.println("학생1 - 기말고사 점수 : " + student.getAverage(100, 85, 70));
		System.out.println("학생1 - 최종 점수 : " + student.getAverage(scores));

		// 학생2(student2)객체를 생성하면서, 아래와 같이 객체를 초기화하세요
		// 이름 : 내이름
		// 나이 : 20
		// 학번 : T100200
		// 전공 : 내전공

		Student student2 = new Student("백승헌", 20 , "T100200", "영어영문학과");
		System.out.println("#### 학생2 ####");
		System.out.println("학생2 - 이름 : " + student2.name);
		System.out.println("학생2 - 나이 : " + student2.age);
		System.out.println("학생2 - 학번 : " + student2.stdNo);
		System.out.println("학생2 - 전공 : " + student2.major);
		
		student.study("음운론");
		System.out.println("학생2 - 중간고사 점수 : " + student2.getAverage(10, 90));
		System.out.println("학생2 - 기말고사 점수 : " + student2.getAverage(100, 85, 70));
		System.out.println("학생2 - 최종 점수 : " + student2.getAverage(scores));
		
	}

}
