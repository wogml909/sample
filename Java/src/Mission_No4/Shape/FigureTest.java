package Mission_No4.Shape;

import Day08.Ex02_Shape.Point;


public class Triangle {
	double width, height;

	// 생성자

	public Triangle() {
	}

	public Triangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	double area() {
		// (가로) x (세로) / 2
		return width * height / 2;
	}

	double round() {
		// TODO Auto-generated method stub
		return 0;
	}
}

public class FigureTest {

	public static void main(String[] args) {
		Triangle triangle = new Triangle(10, 20);
		Rectangle ractangle = new Rectangle(10, 20);
		Circle circle = new Circle(5);
		Trapezoid trapezoid = new Trapezoid(5, 10, 8);

		System.out.println("삼각형의 넓이 : " + triangle.getArea());
		System.out.println("사각형의 넓이 : " + ractangle.getArea());
		System.out.println("원형의 넓이 : " + circle.getArea());
		System.out.println("사다리꼴의 넓이 : " + trapezoid.getArea());
	}
}
