package Basic;

public class FindNumberOfDigit {
	public static void main(String[] args) {
		int num = 1254345;
		int count = 0;
		while(num!=0)
		{
			int r = num%10;
			count++;
			num = num/10;
		}
		System.out.println(+count);
	}

}
