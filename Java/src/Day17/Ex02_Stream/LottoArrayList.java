package Day17.Ex02_Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LottoArrayList {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			System.out.print("몇 게임? ");
			int N = sc.nextInt();

			// N번 반복
			for (int i = 0; i < N; i++) {
				System.out.print("[" + (i + 1) + "게임] : ");
				//(**) int lotto[] = new int[6]
				ArrayList<Integer> lottoList = new ArrayList<Integer>();

				// 랜덤 수 6개를 대입
				for (int j = 0; j < 6; j++) {
					int rand = (int) (Math.random() * 45 + 1); // 1~45 랜덤수
					
					//lottoList.add (rand);

					// 중복제거
					if(lottoList.contains(rand)) {
							j--; // 앞으로 되돌아간다
					}else {
						lottoList.add(rand);
					}

					}
				 // --랜덤 수 6 개 대입(끝)
				
					// 해당 i번째 게임의 랜덤 수들을 정렬
			   Collections.sort(lottoList);
			   
			   //출력
				for (Integer lotto : lottoList) {
					System.out.print(lotto + " ");
				}
				System.out.println();
			}
	 
	}
}
