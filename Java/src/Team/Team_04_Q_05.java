package Team;

import java.util.Scanner;

public class Team_04_Q_05 {

		public static void main(String[] args) {
			// 메뉴판
			// 변수 선언 : 메뉴 번호, 메뉴 이름
			int menuNo = 0;
			String menuName = "";
			Scanner sc = new Scanner(System.in);
	        int count = 0;
			// do~while 문
			// : 무조건 1회는 실행 후, 조건을 검사하여 반복하는 문장

			do {
				System.out.println("####### 치킨 메뉴판 #######");
				System.out.println("1. 황금올리브 반반한 치킨");
				System.out.println("2. 뿌잉클 치킨");
				System.out.println("3. 처갓집에서 호식이가 만든 치킨");
				System.out.println("0. 종료");
				System.out.print("번호 : ");

				// 메뉴 번호 입력
				menuNo = sc.nextInt();

			
				switch (menuNo) {
				case 1:
					menuName = "황금올리브 반반한 치킨";
					break;
				case 2:
					menuName = "뿌잉클 치킨";
					break;
				case 3:
					menuName = "처갓집에서 호식이가 만든 치킨";
					break;
				default:
					break;
				}

				if (menuNo > 1 && menuNo <= 3) {
					System.out.println(menuName + "(이/가) 주문되었습니다.");
				     count++;
				}else
					System.out.println("(1~3)번 사이의 번호를 입력해주세요");
				     
			} while (menuNo != 0);
			
			//주문한 메뉴 개수를 출력해주세요
			System.out.println("총" + count + " 개의 상품이 주문하였습니다.");

			sc.close();
		}
}
