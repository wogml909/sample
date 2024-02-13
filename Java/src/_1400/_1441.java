package _1400;

import java.util.Arrays;
import java.util.Scanner;

public class _1441 {

//선택정렬

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int n = arr.length;
        
        for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();	
		}
        System.out.println("정렬전" + Arrays.toString(arr));
        
		for (int i = 0; i < n - 1; i++) {
			int min = i;// 최소값 저장
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[min])
					min = j;
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
	  }	
	
	for (int i : arr) {
		System.out.println("정렬후" + Arrays.toString(arr));
	}
 }		
}