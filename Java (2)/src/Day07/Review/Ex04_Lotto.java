package Day07.Review;

public class Ex04_Lotto {
 
	
	public static void main(String[] args) {
		// Math.random():0.xxxx ~0.9xxxxx 사이의 난수를 반환하는 메소드
		double random = Math.random();
		System.out.println(random);
		int change;

		// 1~6사이의 정수 : 주사위
		// Math.random() :0.xxxx ~0.9xxxxx
		// Math.random() * 10 :x.xxxx ~9.xxxxxx
		// (int) (Math.random() * 10) : 0 ~ 9 (10개)
		// (int) (Math.random() * 6) : 0 ~ 5 (6개)
		// (int) (Math.random() * 6) + 1 : 1 ~ 6 (6개)
		//
		int dice = (int) (Math.random() * 6) + 1;
		System.out.println("주사위 : " + dice);

		// 1~45 사이의 정수 : 로또
		int lotto = (int) (Math.random() * 45) + 1;
		System.out.println("로또 랜덤 번호 : " + lotto);

		// (공식) : (int) (Math.random() * [개수]) + [시작숫자]

		// 1 ~ 20 사이의 랜덤수
		int ten = (int) (Math.random() * 20) + 1;
		System.out.println("1~20 로또 랜던번호 : " + ten);

		// -20 ~ 20 사이의 랜덤수
		int two = (int) (Math.random() * 41) - 20;
		System.out.println("-20 ~ 20 로또 랜덤번호" + two);

		// 1 ~ 45 사이의 랜덤수 6개를 배열에 중복없이 오름차순으로 저장하시오
		int arr[] = new int[6];

		System.out.println("랜덤출력 오름차순 정렬 전 : ");
		for (int i = 0; i < arr.length; i++) {
			int r = (int) (Math.random() * 45 + 1);
			arr[i] = r;
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		//중복숫자 제외
	
	    for (int i = 0; i < arr.length; i++) {
	    	int me = arr[i];
	    	
			if(me != random)
			System.out.println();
			else
				continue;
		}
			
		
		// 최대값 기준을 배열의 첫째 값으로 정한다
		// 최대값기준으로 배열의 값을 비교한다
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[j-1]> arr[j]) {
					change = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = change;
				} else {
					continue;
				}
			}
		}

		System.out.println("랜덤출력 오름차순 정렬 후");
		for (int h : arr) {
			System.out.print(h + " ");
		}
		System.out.println();
	}

}
