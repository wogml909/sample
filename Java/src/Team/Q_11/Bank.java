
package Team.Q_11;


import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
	static Scanner sc = new Scanner(System.in);
	// 1.계좌를 담는다
	static ArrayList<Account> acounts = new ArrayList<>();

	private static void select() {
		System.out.print("계좌번호>> ");
		String bankCount = sc.nextLine();
		System.out.print("예금주>> ");
		String name = sc.nextLine();
		System.out.print("최초예금액>>");
		int firstcount = sc.nextInt();
		System.out.print("비밀번호>>");
		int pw = sc.nextInt();
		// 인스턴스 최초생성
		Account account = new Account(name, bankCount, firstcount, pw);
		acounts.add(account);// 계좌를 넣은 바구니

		// System.out.println(account);

		// deposit 계좌번호 /depositor 예금주/depoNumber 잔액

		System.out.println(name + "님의 계좌가 개설되었습니다");

	}

	private static void insert() {

		System.out.print("계좌번호>>");
		String bankCount = sc.nextLine();
		System.out.print("입금액>>");
		int amount = sc.nextInt();

		for (Account account : acounts) {
			if(bankCount.equals(account.getDeposit())) {
//				System.out.println("안녕");
				System.out.println("'"+ account.getDepositor() +"'"+"님에게 입금한것이 맞습니까?");
				System.out.println("1예");
				System.out.println("2아니오");
				int a = sc.nextInt();
				if(a == 1) {
					account.setDepoNumber(amount);
					System.out.println(account.getDepoNumber());
					return;
				}else {
					System.out.println("입금이 거절되었습니다");
				}
			}
		}
	}

	private static void minus() {
		System.out.print("계좌번호>>");
		String bankCount = sc.nextLine();
		System.out.print("비밀번호>>");
        int pw = sc.nextInt();
        
        for (Account account : acounts) {
			if(bankCount.equals(account.getDeposit())) {
				if(pw == account.getPw()) {
					System.out.print("출금액>");
					int b = sc.nextInt()*-1;//입력받은 금액을 음수로 변경
					account.setDepoNumber(b);//출금과정
					System.out.println(account.getDepoNumber());//잔액
				}
			}
		}
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
			case 1:
				select(); // 계좌등록
				break;
			case 2:
				insert(); // 입금
				break;
			case 3:
				minus(); // 출금
				break;
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
