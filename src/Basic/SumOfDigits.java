package Basic;

public class SumOfDigits {
	public static void main(String[] args) {
	int num = 3547;
	int sum = 0;
	while(num!=0)
	{
		int r = num%10;
		sum = sum+r;
		num = num/10;
	}
	System.out.println("sum is " +sum);
	}
}

