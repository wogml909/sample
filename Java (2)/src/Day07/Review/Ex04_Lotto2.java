package Day07.Review;

public class Ex04_Lotto2 {
 
	
	public static void main(String[] args) {
		// Math.random():0.xxxx ~0.9xxxxx 사이의 난수를 반환하는 메소드
		int change;
		// 1 ~ 45 사이의 랜덤수 6개를 배열에 중복없이 오름차순으로 저장하시오
		int arr[] = new int[6];


		//중복숫자 제외
		System.out.println("랜덤출력 오름차순 정렬 전 : ");
	    for (int i = 0; i < arr.length; i++) {
	    	int r = (int) (Math.random() * 45 + 1);
			arr[i] = r;
			
	    	for (int j = 0; j < i ; j++) {
				if(arr[j] != r) {
			      continue;
				}else{
				  i--;
			   }
			}	
	    }
	    for (int b : arr) {
				System.out.print(b + " ");
			}
			System.out.println();
		
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
