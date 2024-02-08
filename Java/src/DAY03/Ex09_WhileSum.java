package DAY03;

public class Ex09_WhileSum {

	public static void main(String[] args) {
		// 1 부터 100까지의 합계를 구하시오
		// 1+2+3+4+---+100 =5050
		
		int a = 1;
		int sum = 0;
		
		while(a <= 100) {
//			방법1
//			sum += a;
//			a += 1;
//			방법2
//			sum = sum + a++;
//			
//			방법3
			sum += a++;
		}
      System.out.println("합계 : " + sum);
	}

}
