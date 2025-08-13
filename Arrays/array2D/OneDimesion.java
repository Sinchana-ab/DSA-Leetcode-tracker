package array2D;

import java.util.Arrays;
import java.util.Scanner;

public class OneDimesion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array size: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("enter the array elements: ");
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		sc.close();
	}
}
