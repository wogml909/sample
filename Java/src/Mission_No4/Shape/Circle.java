package Mission_No4.Shape;

public class Circle extends shape {
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

	public String getArea() {
		// TODO Auto-generated method stub
		return null;
	}
}
