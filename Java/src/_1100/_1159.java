package _1100;

import java.util.Scanner;

public class _1159 {

	public static void main(String[] args) {
		// TODO Aut6o-generated method stub
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    
    if((input >= 50 && input <= 70) || (input % 6 == 0)) {
    	System.out.println("win");
	} else 
		System.out.println("lose");
 }
}
