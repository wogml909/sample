package Day08.Ex02_Shape;
//부모자식개념 추상클래스 다중상속안됨 그러나 인터페이스는 다중상속이 가능하다
public class Circle extends Shape {
	double radius;

	public Circle() {
		this(0);
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	double area() {
		// (원주율) x (반지름) x (반지름)
		return Math.PI * radius * radius;
	}

	@Override
	double round() {
		// 2 * (원주율) * (반지름)
		return Math.PI * radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

}
