package _1300;


import java.util.Scanner;

public class _1351 {
    public static void main(String[] args) {
        // 구구단 입력 출력

        // 두 숫자를 입력받는다
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();


        for (int i = a; i <= b; i++) {
            for (int j = 1; j <= 9; j++) {
               System.out.println(i + "*" + j + "=" + (i * j));
            }
        }

        // Scanner 닫기
        sc.close();
    }
}