package number_dsa_probems;

import java.util.Scanner;

public class Fibbonocci_uptoN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number upto fibbo will print");
		int n = sc.nextInt();
		System.out.println("the fibbo are: ");
		int a = 0;
		int b = 1;
		if(n == 0)
			System.out.println(a);
		else if(n==1)
			System.out.println(a+ " \n "+b);
		for(int i = 1;i<=n;i++) {
			int c= a+b;
			a = b;
			b = c;
			System.out.println(c);
			
		}
		sc.close();
	}
}
