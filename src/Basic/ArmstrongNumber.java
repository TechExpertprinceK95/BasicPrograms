package Basic;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int num = 157;
		int sum = 0;
		int temp = num;
		while(temp>0) {
			int rem = temp%10;
			sum+=(rem*rem*rem);
			temp = temp/10;
		}
	        if(num==sum) {
	        	System.out.println("Armstrong number");
	        }
	        	else {
	        		System.out.println("Not Armstrong");
	        	}
	        }
	}


