package Basic;

import java.util.Scanner;

public class PrimeNumberProgram {
	public static void main(String[] args) {
		int i,num,count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
	    num = sc.nextInt();
	    for(i = 2;i<num;i++)
	    {
	    	if(num%i ==0)
	    	{
	    		count++;
	    		break;
	    	}
	    }
	    	if(num==0)
	    	{
	    		System.out.println("Number is prime");
	    	}else {
	    		System.out.println("Number is not prime");
	    	}
	    }
	}
