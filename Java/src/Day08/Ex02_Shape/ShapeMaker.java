package Day08.Ex02_Shape;

import java.util.Scanner;

public class ShapeMaker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//입력변수
		double width = 0.0;
		double height = 0.0;
		double radius = 0.0;
		//입력 받은 도형 배열
		Shape[] ShapeList = new Shape[3];
		int index = 0;
		
		while( true ) {
			if(index == 3) break;
			
			System.out.println("1. 삼각형, 2. 사각형, 3.원형");
		    System.out.print(">>");
		    String input = sc.next();//next() : Sting 문자열
		
		    if(input.equals("그만")) 
		    	break;
		    	//도형선택
		    	switch(input){
		    		//삼각형
		    		case "1":
		    			System.out.print("가로 : ");
		    			width = sc.nextDouble();
		    			System.out.print("세로 : ");
		    			height = sc.nextDouble();
		    			
		    			ShapeList[index++] = new Triangle(width,height);
		    			break;
		    		
		    		//사각형
		    		case "2":
		    			System.out.print("가로 : ");
		    			width = sc.nextDouble();
		    			System.out.print("세로 : ");
		    			height = sc.nextDouble();
		    			
		    			ShapeList[index++] = new Rectangle(width,height);
		    			break;
		    		
		    		//원형
		    		case "3":
		    			System.out.print("반지름 : ");
		    			radius = sc.nextDouble();

		    			ShapeList[index++] = new Circle(radius);
		    			break;
		    		
		    	} // switch end
		    }// while end
		
		//넓이 총합, 둘레 총합
		double areaSum = 0.0;
		double roundSum = 0.0;
       
		for (Shape shape : ShapeList) {
			if(shape == null)
				continue;
			
			//instanceof
			// 같은 인스턴스면 true, 아니면 false를 반환
			if(shape instanceof Triangle)
				System.out.println("삼각형");
			if(shape instanceof Rectangle)
				System.out.println("사각형");
			if(shape instanceof Circle)
				System.out.println("원형");
			//넓이와 둘레
			double area = shape.area();
			double round = shape.round();
			
			//합계
			areaSum += area;
			roundSum += round;
			
			System.out.println("넓이 : " + area + "\t");
			System.out.println("둘레 : " + round + "\t");
		}// foreach 끝
		System.out.print("넓이 총합 : " + areaSum);
		System.out.print("둘레 총합 : " + roundSum);

		sc.close();
	
	}
}
