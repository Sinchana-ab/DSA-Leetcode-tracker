package number_dsa_probems;

import java.util.Scanner;

public class PrimeNumber_uptoN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number upto prime number it will print");
		int n = sc.nextInt();
		System.out.println("the prime numbers are: ");
		for(int i = 1;i<= n;i++) {
			int count = 0;
			for(int j =2;j <= i/2;j++) {
				if(i%j == 0) {
					count++;
					break;
				}
			}
			if(count == 0) {
				System.out.println(i);
			}
		}
		sc.close();
	}
}
