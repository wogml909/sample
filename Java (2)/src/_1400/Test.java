package _1400;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		// 버블정렬
	  Scanner sc = new Scanner(System.in);	
	  int[] arr = new int[6];
	  int n = arr.length;
	  
	  for (int i = 0; i < n; i++) {
		arr[i] = sc.nextInt();
	}
	  for (int i = n-1; i > 0; i--) {
		for (int j = 0; j < i; j++) {
			if (arr[j] > arr[j+1]) {
				int temp = arr[j];
			    arr[j] = arr[j+1];
			    arr[j+1] = temp;
			} 
		 }
			
		}
	  for (int i = 0; i < n; i++) {
		System.out.println(arr[i]);
	}
 } 
}