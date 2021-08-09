package Basic;

import java.util.Scanner;

public class CheckPrimeN {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
	    int i;
	       if(n==1)
	       {
	    	   System.out.println("Prime Start from 2");
	       }
	       for(i = 2; i<n;i++)
	       {
	    	   if(n%i == 0)
	 
	    		   System.out.println("Not a Prime");
	    	       break;
	    	   }
	    	   if(n==i)
	    	   System.out.println("prime");
	       }
	}

