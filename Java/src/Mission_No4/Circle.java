package Mission_No4;

//Circle 클래스 정의
public class Circle extends Shape {
//필드: 반지름
	private double radius;

//생성자: 반지름을 매개변수로 받아 초기화
	public Circle(double radius) {
		this.radius = radius;
	}

//draw() 메서드 구현: 원을 그리는 코드
	public void draw() {
		// 원을 그리는 코드 (생략)
	}

//resize() 메서드 구현: 원의 크기를 변경하는 코드
	public void resize() {
		// 원의 크기를 변경하는 코드 (생략)
	}

//getArea() 메서드 구현: 원의 넓이를 계산하여 반환
	public double getArea() {
		return radius * radius * Math.PI;
	}
}

