package Basic2;

public class FactorialUsingRecursion {
	public static void main(String[] args) {
		int num = 4;
		System.out.println("number: "+num);
		System.out.println("factorial number of:"+num+ " is " +findfactorial(num));
	}

	public static int findfactorial(int num) {
		int fact = 1;
		while(num>0) {
			fact = fact*num;
			num--;
		}

		return fact;

	}

}
