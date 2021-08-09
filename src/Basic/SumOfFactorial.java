package Basic;

public class SumOfFactorial {
	public static void main(String[] args) {
     int num = 4;
     int sum = 0;
     for(int i=1;i<=num;i++)
         sum = sum+fact(i);
   System.out.println(+sum);
}
		
		static int fact(int x)
		{
			int fact  = 1;
			for(int i=1;i<=x;i++) 
				fact = fact*i;
				return fact;
			}
		}
