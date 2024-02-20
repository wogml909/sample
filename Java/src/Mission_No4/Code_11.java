package Mission_No4;

import Day08.Ex02_Shape.Circle;
import Day08.Ex02_Shape.Rectangle;
import Day08.Ex02_Shape.Triangle;



public class Code_11 {
	public static class FigureTest {

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
}
