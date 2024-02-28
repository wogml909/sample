package Team;

import java.util.Scanner;

public class Team_04_Q_6 {

		public static void main(String[] args) {
			// 메뉴판
			// 변수 선언 : 메뉴 번호, 메뉴 이름
			Scanner sc = new Scanner(System.in);
			int count = 0;
			String menuName ="";
			int menuNo = 0;
		    do {
		    	//메뉴판
   	            System.out.println("#####상영관표#####");
				System.out.println("1. 이웃집토토로");
				System.out.println("2. 하울의움직이는 성");
				System.out.println("3. 센과치히로의 행방불명");
				System.out.println("4. 게드전기");
				System.out.println("0. 종료");
				System.out.print("원하시는 영화를 입력해주세요 : ");
				menuNo = sc.nextInt();
				
				switch(menuNo) {
				case 1 : menuName = "이웃집 토토로" ; break;
				case 2 : menuName = "하울의움직이는 성" ; break;
				case 3 : menuName = "센과치히로의 행방불명" ; break;
				case 4 : menuName = "게드전기" ; break;
				default :  break;
				}
				if (menuNo >= 0 && menuNo <= 4) {
					System.out.println(menuName+"(을/를)예매하였습니다.");
					count++;
				}else {
					System.out.println("(0~4)사이 숫자만 입력해주세요");
				}
			} while (menuNo !=0);
		    
		    System.out.println("총" + count +"편의 영화를 예매하였습니다");
		    sc.close();
		}
}
