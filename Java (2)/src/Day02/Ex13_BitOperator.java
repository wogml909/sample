package Day02;

public class Ex13_BitOperator {

	public static void main(String[] args) {
       //AND
       int result = 20 & 16;
       System.out.println("20 & 16 = " + result);
       
       //Integer.toBinaryString(): 십진수를 이진수 문자열로 변환하는 메소드
       System.out.println( Integer.toBinaryString(20));
       System.out.println( Integer.toBinaryString(16));
       System.out.println( "------------------");
       System.out.println( Integer.toBinaryString(result));
       System.out.println();
       
       //OR;
       int result2 = 20 | 16;
       System.out.println("20 | 16 = " + result2);
       
       System.out.println( Integer.toBinaryString(20));
       System.out.println( Integer.toBinaryString(16));
       System.out.println( "------------------");
       System.out.println( Integer.toBinaryString(result2));
       System.out.println();
       
       //XOR;
       int result3 = 20 ^ 16;
       System.out.println("20 ^ 16 = " + result3);
       
       System.out.println( Integer.toBinaryString(20));
       System.out.println( Integer.toBinaryString(16));
       System.out.println( "------------------");
       System.out.println( Integer.toBinaryString(result3));
       System.out.println();
       
     	// 비트 연산자의 경우, 쇼트 서킷 적용되지 않는다.
		// : 논리 연산의 ㅣ결과를 미리 알아서, 남은 논리식을 확인하지 않는 것
		int value3=3;
		System.out.println(false || ++value3 > 10);
		System.out.println("value3 : " + value3); 
		
		int value4=3;
		System.out.println(true || ++value4 > 10);
		System.out.println("value4 : " + value4); 
		

		
	}

}
