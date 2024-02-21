package Mission_No4.Shape;

public class Rectangle extends shape {
	  double width, height;
	  //생성자
	 public Rectangle() {
	 }

	 public Rectangle(double widht, double height) {
	 	this.width = widht;
	 	this.height = height;
	 }

	 @Override
	 double area() {
	 	// (가로) x (세로)
	 	return width * height;
	 }

	 @Override
	 double round() {
	 	// ((가로) x (세로)) * 2
	 	return (width * height) * 2;
	 }

	 public double getWidht() {
	 	return width;
	 }

	 public void setWidht(double widht) {
	 	this.width = widht;
	 }

	 public double getHeight() {
	 	return height;
	 }

	 public void setHeight(double height) {
	 	this.height = height;
	 }

	public String getArea() {
		// TODO Auto-generated method stub
		return null;
	}
	   
}
