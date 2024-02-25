package Day08.Ex02_Shape;

public class Point {
    //alt + shift + s
	int x,y;

	//기본생성자 alt + shift + s + Generate Contstructor Using Field 체크풀기

	public Point() {
	}
   //매개변수가 있는 생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
    //alt + shift + s + Generate tostring
	@Override
	public String toString() { 
		return "Point [x=" + x + ", y=" + y + "]";
	}
         
}
