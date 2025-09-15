package number_dsa_probems;

import java.util.Scanner;

public class CountDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to count the digit");
		int n = sc.nextInt();
		int temp = n;
		int count = 0, rem =0, rev =0;
		while(n>0) {
			rem = n % 10;
			rev = rev *10 + rem;
			count++;
			n = n/10;
		}
		System.out.println("the count of digits in number "+count);
		if(temp == rev) {
			System.out.println("its palindrome");
		}
		else {
			System.out.println("its not a palindrome");
		}
		System.out.println("reversed number is: "+rev);
		int div = (int) Math.pow(10, count-1);
		while(div != 0) {
			int q= temp / div;
			System.out.println(q);
			temp = temp % div;
			div = div /10;
		}
		sc.close();
	}
}
