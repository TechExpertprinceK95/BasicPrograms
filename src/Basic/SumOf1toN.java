package Basic;

import java.util.Scanner;

public class SumOf1toN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int sum = 0;
		for(int i = 1;i<=num;i++)
		{
			sum += num;
		}
			System.out.println(sum);
		}

}
