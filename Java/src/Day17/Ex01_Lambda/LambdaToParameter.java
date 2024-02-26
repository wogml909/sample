package Day17.Ex01_Lambda;


/*
 * 매개변수 있는 람다식
 * - 최대값을 구하는 함수
 * - 함계를 한 함수
 * **/

@FunctionalInterface
interface SmartCale{
	int cal(int x, int y);
}

public class LambdaToParameter {

	public static void main(String[] args) {
		//최대값
		SmartCale sc1 = (x, y) -> {return(x > y) ? x : y;};
		
		// x~y 까지의 합계
		SmartCale sc2 = (x,y) -> {
			int sum = 0;
			for (int i = 0; i < args.length; i++) {
				sum += i;
			}
			return sum;
		};
		int result1 = sc1.cal(100, 50);
		int result2 = sc1.cal(1, 10);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		
		//메소드의 익명함수(람다식) 정달하여 사용할 수도 있다
		smartCalc(sc1, 10,20);
		smartCalc(sc2, 1,5);
	}
		// ? : 메소들르 메소드에 전달할 수 있나요?
	   // A : 람다식을 정의한 익명 함수는 인터페이스 타입으로 전달할 수 있다.
		public static void smartCalc(SmartCale sm, int a, int b) {
			int result  = sm.cal(a, b);
			System.out.println("result : " + result);
			
		}
	}

