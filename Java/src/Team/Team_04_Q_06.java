package Team;

import java.util.Scanner;

public class Team_04_Q_06 {
//	정수N을입력받아N개의게임의로또번호를출력하시오. 
//	즉, 6개의 배열요소를갖는1차원배열을선언하여1~45 
//	사이의랜덤한값을중복되지않도록저장하고출력하는과정을
//	N번반복하시오.
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("몇 개임 : ");
		int N = sc.nextInt();
		int arr[] = new int[6];
		int count = 1;

		// 중복숫자 제외
    	 		 
		for (int i = 0; i < arr.length; i++) {
			int r = (int) (Math.random() * 45 + 1);
			arr[i] = r;

			for (int j = 0; j < i; j++) {
				if (arr[j] != r) {
					continue;
				} else {
					i--;
				}
              count++;
			}			
		}
        System.out.print("[" + count + "게임]: ");
		for (int b : arr) {
			System.out.print(b + " ");
		}
		
		
		// System.out.println(Math.random());
		// System.out.println(random.nextlnt(10));
	}
}