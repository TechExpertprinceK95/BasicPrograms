package BasicProgramTricky;
import java.util.Scanner;

class Utility{
static boolean numberOrNot(String input){
try{
   Integer.parseInt(input);
   }
   catch(NumberFormatException e)
   {
   return false;
   }
   return true;
   }
}
public class MobileNumberCheck{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a mobile number");
String input=sc.next();
if(Utility.numberOrNot(input) && (input.length()==10)){
	System.out.println("Good!!! Number is valid");
}
	else{
		System.out.println("Bad!! Number is not valid");
	}
}
}
