package Basic;

public class SumOfPrime {
	public static void main(String[] args) {
		int m = 10;
		int n = 100;
		int sum = 0;
		for(int i=m;i<=n;i++) {
			if(isPrime(i))
				sum = sum+i;
		         }
		           System.out.println(+sum);
	}



public static boolean isPrime(int n) {
	int count  = 0;
	for(int i=2;i<=n/2;i++)
	{
	if(n%i==0) {
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
