package _1400;

import java.util.Arrays;
import java.util.Scanner;

public class _1442 {

	static int[] arr;

	public static void main(String[] args) {
		// 버블정렬
		Scanner sc = new Scanner(System.in);
		arr = new int[6];
		for (int i = 0; i < 6; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("정렬전" + Arrays.toString(arr));

		// 한번의 반복이 완료될때 마다 가장 큰 수는 배열의 마지막부분으로 밀리는것이 보장된다
		for (int i = arr.length - 1; i > 0; i--) {
			//한번 반복마다 가장뒤 인덱스는 비교하지않도록 반복문 설계
			for (int j = 0; j < i; j++) {
				//만일 앞의 수가 뒤보다 크면 swap연산진행
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

		}
		System.out.println("\t");
		System.out.println("정렬후" + Arrays.toString(arr));
	}
}
