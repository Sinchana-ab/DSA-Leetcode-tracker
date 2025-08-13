package array2D;

import java.util.Arrays;

public class OneToTwoD {
	public static void main(String[] args) {
		int[][] array = {
				{1,2,3},
				{2,3,4}
				};
		int m = array.length, n = array[0].length;
		int k = m*n, l=0;
		int[] arr = new int[k];
		for(int i = 0;i<m;i++) {
			for(int j = 0;j<n;j++) {
				arr[l++] = array[i][j]; 
			}
		}
		
		System.out.println(Arrays.toString(arr));
//		for(int i =0;i<k;i++) {
//			System.out.println(arr[i]);
//		}
	}
}
