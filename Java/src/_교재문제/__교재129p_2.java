package _교재문제;

public class __교재129p_2 {

	public static void main(String[] args) {
		// 구구단을 짝수 단만 출력하도록 프로그램을 만들라 
		//countinue 문을 사용

     for (int dan = 2; dan <=9;dan++) {
    	 if(dan%2 != 0) {
    		 continue;
    	 }
    	 for (int multi = 0; multi < 9; multi++) {
			System.out.println(dan + "*" +multi + "=" + (dan * multi));
		}
     }
	}

}
