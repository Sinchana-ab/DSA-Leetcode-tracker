package dimension2;

import java.util.*;

public class SecondSmallestDigit {
	public static int SecondDigit(int n) {
		int digit =0;
		int min = Integer.MAX_VALUE;
		int smin = Integer.MAX_VALUE;
		while(n>0) {
			digit = n % 10;
			if(digit < min ) {
				smin = min;
				min = digit;
			}
			else if(smin>digit && digit != min) {
				smin = digit;
			}
			n = n/10;
		}
		return smin;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("the second minimum element is "+(SecondDigit(n)));
		sc.close();
	}
}
