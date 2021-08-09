package Basic;

import java.util.Scanner;

public class HikeCalculator {
	public static void main(String[] args) {
		int oldsalarypermonth;
		int hike;
		    Scanner sc = new Scanner(System.in);
		    System.out.println("Enter the OldSalaryPerMonth");
		    oldsalarypermonth = sc.nextInt();
		   
		    System.out.println("Enter your hike percentage");
		    hike = sc.nextInt();
		    
		    int presentSalaryPerMonth = oldsalarypermonth;

	        System.out.println("After hike your present salary per month is: " + presentSalaryPerMonth );
	    }
	}
	

