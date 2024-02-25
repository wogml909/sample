package Day06.Ex05_StaticMember;

import java.util.Iterator;

class Calculator {
	// 아래 연산 결과를 구하는 STATIC 메소드를 정의하시오
	// 1.절대값
	// 2.최대값
	// 3.최솟값

	// 절댓값
	public static int abc(int val) {
		return val >= 0 ? val : -val;
	}

	// 최대값
	public static int max(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i : arr) {
			if (i > max)
				max = i;
		}
		return max;
	}

	// 최솟값
	public static int min(int[] arr) {
		int min = Integer.MAX_VALUE;
		for (int i : arr) {
			if (i < min)
				min = i;
		}
		return min;
	}

}

public class StaticCalculator {

	public static void main(String[] args) {

		int arr[] = { 70, 65, 90, 85, 100 };
		// 다른 클래스의 static 메소드를 호출하는 방법
		// : 클래스명.메소드명();
		// ex) Calcuator.max(arr);
		System.out.println("abc(-123) : " + Calculator.abc(-123));
		System.out.println("max(arr) : " + Calculator.max(arr));
		System.out.println("mix(arr) : " + Calculator.min(arr));
	}

}
