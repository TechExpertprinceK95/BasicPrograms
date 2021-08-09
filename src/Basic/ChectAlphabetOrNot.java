package Basic;

import java.util.Scanner;

public class ChectAlphabetOrNot {
	public static void main(String[] args) {
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number");
	    ch = sc.next().charAt(0);
	    if(ch >= 'a' && ch <='z') || (ch <= 'A' && ch <='Z')
	    {
	    	System.out.println(ch + "is an alphabate");
	    }else {
	    	System.out.println(ch + "is not alphabate");
	    }
	}

}
