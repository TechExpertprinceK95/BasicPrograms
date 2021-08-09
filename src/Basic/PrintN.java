package Basic;

import java.util.Scanner;

public class PrintN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int m = sc.nextInt();
		System.out.println("Enter the second number");
		int n = sc.nextInt();
		for(int i=m;i<=n;i++)
		{
			System.out.println(i);
		}
	}

}
