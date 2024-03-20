package Team.Q_11;

import java.awt.print.Printable;
import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
	static Scanner sc = new Scanner(System.in);
	// 1.계좌를 담는다
	ArrayList<Account> acount = new ArrayList<>();
    
	private static void select () {
		System.out.print("계좌번호를 입력하세요 : ");
		String bankCount = sc.nextLine();
		System.out.print("예금주를 입력하세요 : ");
		String name = sc.nextLine();
		System.out.print("최초예금액 입력하세요 : ");
		int firstcount = sc.nextInt();
		System.out.print("비밀번호를 입력하세요 : ");
		int pw = sc.nextInt();
		//인스턴스 최초생성
	Account account = new Account(name,bankCount,firstcount,pw);
   System.out.println(account);
		
	}
	private static void insert() {
		System.out.print("계좌번호를 입력하세요 : ");
		String bankCount = sc.nextLine();
	}

	public static void menu() {
		/*
		 * 계좌 메뉴
		 * 
		 */
		System.out.println("============ 입금 =============");
		System.out.println("1. 계좌등록");
		System.out.println("2. 입금");
		System.out.println("3. 출금");
		System.out.println("4. 계좌조회");
		System.out.println("5. 계좌목록");
		System.out.println("6. 종료");
		System.out.println("==============================");

	}

	public static void main(String[] args) {
		Account account = new Account();

		// deposit 변수는 private 로 지정해서 접근불가
		// setter 메소드를 통해 예금액을 지정한다
		// (에러) account.deposit = 100000

		account.setDepoNumber(1000000);

		int money = account.getDepoNumber();
		System.out.println(account);
		System.out.println("예금액 : " + money);

		int menuNo = 0;
		do {
			// 메뉴판 출력
			menu();

			// 메뉴 번호 입력
			menuNo = sc.nextInt();
//        	System.out.println("입력");
			sc.nextLine();// 엔터를 입력버퍼에서 제거

			// 프로그램 종료
			if (menuNo == 0)
				break;

			// 메뉴선택
			switch (menuNo) {
			case 1: select(); // 등록
				   break;
         	case 2: insert(); // 입금
         	break;
//        	case 3: minus(); // 출금
//        	break;
//        	case 4: select(); // 계좌조회
//        	break;
//        	case 5: list(); // 계좌목록
//        	break;
			}

		} while (menuNo != 0);
		System.out.println("프로그램을 종료합니다.");
		/*
		 * 계좌 목록
		 * 
		 */
	}

}
