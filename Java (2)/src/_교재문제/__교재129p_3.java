package _교재문제;

public class __교재129p_3 {

	public static void main(String[] args) {
		//구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력하는 프로그램을 만들라
		//break문사용

	
	for (int dan =2; dan <=9;dan++) {
		for(int multi =1; multi <=9; multi++) {
			if(multi > dan) {
				break;
			}
			System.out.println(dan + "*" +multi+ "=" +(dan*multi));
		}
	}

}
}
