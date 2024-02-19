package Day12.Ex01_Object;

/**
 * Object 클래스의 equals() 메소드활용
 */

class Student {
	int studentId; // 학번
	String studentName; // 이름

	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
	}
	
    //equals() 메소드 오버라이딩
	@Override
	public boolean equals(Object obj) {
		//두 객체가 의미상으로 일치하는지 여부를 true, false반환
		if(this == obj)
			return true;
		
		//null 체크
		//NullPointerException 발생 가능
		if (obj == null) {
			return false;
		}
		
		//학번과 학생명이 모두 일치하는 경우
		Student student = (Student) obj; //다운 캐스팅
		if(this.studentId == student.studentId && this.studentName.equals(student.studentName)) {
			return true;
		}

			return false;
	}
	
	
	

}

public class ObjectEquals {

	public static void main(String[] args) {
		Student student = new Student(1001, "김조은");
		Student student2 = student;
		Student student3 = new Student(1001, "김조은");

		// 학생 1과 학생 2의 레퍼런스 비교
		if (student == student2) {
			System.out.println("student와 student2의 주소(레퍼런스)가 같습니다");
		} else {
			System.out.println("student와 student2의 주소(레퍼런스)가 다릅니다");
		}
		System.out.println("============================");

		// 학생1과 학생2의 인스턴스 비교
		if (student.equals(student2)) {
			System.out.println("student 와 student2는 같습니다");
		} else {
			System.out.println("student 와 student2는 다릅니다");
		}
		System.out.println("============================");

		// ==================================================================
		// 학생 1과 학생 3의 레퍼런스 비교
		if (student == student3) {
			System.out.println("student와 student3의 주소(레퍼런스)가 같습니다");
		} else {
			System.out.println("student와 student3의 주소(레퍼런스)가 다릅니다");
		}
		System.out.println("============================");

		// 학생1과 학생3의 인스턴스 비교
		if (student.equals(student3)) {
			System.out.println("student 와 student3는 같습니다");
		} else {
			System.out.println("student 와 student3는 다릅니다");
		}
		System.out.println("============================");
	}
}
