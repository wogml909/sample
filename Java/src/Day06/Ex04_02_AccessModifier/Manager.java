package Day06.Ex04_02_AccessModifier;

import Day06.Ex04_01_AccessModifier.Person;

public class Manager {
	 public static void main(String[] args) {
		Student student = new Student();
		System.out.println("name : " + student.name);
		System.out.println("age : " + student.getAge());
		//Manager 에서 Student의 default접근지정자 변수를 접근할 수 없는이유
		//- 같은패키지에 있지만, 실질적으로 height를 선언한 곳은
		// 다른 패키지인 person 에서 선언을 했기 때문에 접근 불가
		// * 선언한 클래스릎 기준으로 접근지정자가 적용된다.
		System.out.println("height : " + student.getHeight());
		System.out.println("weight : " + student.getWeight());
		System.out.println();
		
		Person person = new Person("김조은",20,170,60);
		System.out.println("name : " + person.name);
		System.out.println("age : " + person.getAge());
		System.out.println("height : " + person.getHeight());
		System.out.println("weight : " + person.getWeight());
		System.out.println();
	}
}
