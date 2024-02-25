package Mission_No4;

public class Student {
  
	private String Student;
	
    //기본생성자
	public Student(int no, String name, int score, String className) {
	}
    //매개변수가 포함된 생성자
	public Student(String student) {
		Student = student;
	}
	
	//getter,setter 메소드
	public String getStudent() {
		return Student;
	}
	public void setStudent(String student) {
		Student = student;
	}
	//toString 오버라이드
	@Override
	public String toString() {
		return "Student [Student=" + Student + "]";
	}
	
	
}
