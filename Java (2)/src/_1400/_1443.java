package _1400;

import java.util.Scanner;

public class _1443 {
	//삽입정렬
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int n = arr.length;
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
//		System.out.println("변경전" + Arrays.toString(arr));
		for (int i = 0; i < n; i++) {
			int key = arr[i]; //선택데이터
			int j = i - 1; //비교데이터
			
			//이전 원소보다 더크면 데이터는 하나씩 뒤로 밀린다
		while (j >= 0 && arr[j] > key) {
			arr[j+1] = arr[j];
			j--;	
		}
		arr[j+1] = key;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
//		System.out.println("변경후" + Arrays.toString(arr));
	}
}

