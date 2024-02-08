package DAY03;

public class Ex14_GuguAll {

	public static void main(String[] args) {
		// (eks)*(1~9)
		// 단에 대한 반복 : 1~9
		// 각 단의 곱    : 1~9
		
		//중첩반복문
		//A * B
		//i : 단(A)
     for (int i = 1; i <= 9; i++) {
    	 for (int j = 1; j <= 9; j++) {
			System.out.println(i + "*" +j + "=" + (i*j));
			System.out.println("\t"); //탭(공백)
		}
    	System.out.println();
		
	 }
	}

}
