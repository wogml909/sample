package Day02;

public class Ex12_LogicalOperator {

	public static void main(String[] args) {
		// 논리 연산자
		//A AND B : A와 B둘다 ture일때 결과가 ture
		//A     B 결과
		//----------------------
		//F     F  F
		//T     F  F
		//F     T  F
		//F     T  T
		System.out.println(true && true); //T
		System.out.println(true && false);//F
		System.out.println(false && true);//F
		System.out.println(false && false);//F
		System.out.println();
		
		//OR (||)      --"|" 쓰는 법 :노ㅑㄽ + \(원화표시)
        //A OR B          : A와 B 둘중 하나라도 true면 결과 true
		//A     B 결과
		//----------------------
		//F     F  F
		//T     F  T
		//F     T  T
		//F     T  T
		System.out.println(true|| true); //T
		System.out.println(true || false);//T
		System.out.println(false || true);//T
		System.out.println(false || false);//F
		System.out.println();
		
		// NOT (!)
		//!A :A가 true 면, false /false 면 true 로변환
		System.out.println(!true); 
		System.out.println(!false);
		System.out.println();
		
		//쇼트 서킷
		// : 논리 연산의 ㅣ결과를 미리 알아서, 남은 논리식을 확인하지 않는 것
		int value1=3;
		System.out.println(false && ++value1 > 10);//뒤에 실행하지 않는 죽은코드다
		System.out.println("value1 : " + value1); //3
		
		int value2= 3;
		System.out.println(true || ++value2 > 10);//뒤는 실행하지 않는 죽은코드다
		System.out.println("value2 : " + value2); //3

		
	}

}
