package Basic;

public class PrimeNFromMtoN {
public static void main(String[] args) {
	int m = 10;
	int n = 50;
	for(int i=m;i<=n;i++)
	{
		if(isPrime(i))
			System.out.println(i);
	}
}


public static boolean isPrime(int n) {
	int count = 0;
	for(int i=2;i<=n/2;i++)
	{
		if(n%i==0)
		{
			count++;
			break;
		}
	}
		if(count==0)
			return true;
		else
			return false;
		}
}
	


