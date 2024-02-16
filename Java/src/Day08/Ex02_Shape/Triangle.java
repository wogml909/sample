package Day08.Ex02_Shape;

public class Triangle extends Shape{
	
	double width, height;
	
	//생성자
	
	public Triangle() {
	}
    
	public Triangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	
	@Override
	double area() {
		// (가로) x (세로) / 2
		return width * height / 2;
	}


	@Override
	double round() {
		//  (정삼각형) : (한 변의 길이) * 3
		return width * 3;
	}

	public double getWhidth() {
		return width;
	}

	public void setWhidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
    
}
