package Day02;

public class Ex03_Byte {

	public static void main(String[] args) {
		// byte 는 1byte 범위의 정수 데이터를 표현
		// 8bite  (0000 0000) : 2^8 : 256개
		// 양수와 음수로 나누면, -128~127 범위로 표현가능
		
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
		byte var6 = (byte) 128; //형변환 129가 아닌 -128로 다시 순환된다
		//에러 byte var5 = 128;
		// 자료형(타입)이 불일치, 데이터 범위를 벗어남(overflow)
		
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		System.out.println("var5 : " + var5);
		System.out.println("var6 : " + var6);

	}

}
