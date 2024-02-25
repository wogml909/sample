package Mission_No4;

//Rectangle 클래스 정의
public class Rectangle extends Shape
{
//필드: 가로, 세로
	private double width;
	private double height;

//생성자: 가로와 세로를 매개변수로 받아 초기화
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

//draw() 메서드 구현: 사각형을 그리는 코드
	public void draw() {
		// 사각형을 그리는 코드 (생략)
	}

//resize() 메서드 구현: 사각형의 크기를 변경하는 코드
	public void resize() {
		// 사각형의 크기를 변경하는 코드 (생략)
	}

//getArea() 메서드 구현: 사각형의 넓이를 계산하여 반환
	public double getArea() {
		return width * height;
	}
}
