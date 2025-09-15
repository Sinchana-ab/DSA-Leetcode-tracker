package day1_arrays_String;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_elementsApearence {
	public static boolean isTwiceApearence(int[] num) {
		if(num.length <= 1)
			return false;
		Arrays.sort(num);
		int i = 1;
		while(i<num.length) {
			if(num[i-1] == num[i]) {
				return true;
			}
			i++;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int[] nums = {1,2,3,1};
		System.out.println("enter the array size");
		int n = sc.nextInt();
		int[] nums = new int[n];
		System.out.println("enter the array elements:");
		for(int i = 0;i<n;i++) {
			nums[i] = sc.nextInt();
		}
		System.out.println("the elements has twice: "+(isTwiceApearence(nums)));
		
		sc.close();
	}
}
