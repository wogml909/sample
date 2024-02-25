package _교재문제;

public class _교재129p_1 {

	public static void main(String[] args) {
		// operator 값이 +,-,*,/ 사칙연산 수행하는 프로그램을 작성하라
		//if -else문과 switch-case문사용
		int num1 = 10;
		int num2 = 2;
		char operator = '+';

//	    if (operator == '-') {
//	    	System.out.println(num1+ "-" + num2 + " = " + (num1 - num2));
//	    }else if(operator == '+') {
//	    	System.out.println(num1+ "+" + num2 + " = " + (num1 + num2));
//	    }else if(operator == '*') {
//	    	System.out.println(num1+ "*" + num2 + " = " + (num1 * num2));
//	    }else {
//	    	System.out.println(num1+ "/" + num2 + " = " + (num1 / num2));
//	    }
//	}

		switch(operator) {
		case '+':
			System.out.println(num1+ "+" + num2 + " = " + (num1 + num2));
			break;
		case '-':
			System.out.println(num1+ "-" + num2 + " = " + (num1 - num2));
			break;
		case '*':
			System.out.println(num1+ "*" + num2 + " = " + (num1 * num2));
			break;
		case '/':
			System.out.println(num1+ "/" + num2 + " = " + (num1 / num2));
			break;

		}
	}
}
