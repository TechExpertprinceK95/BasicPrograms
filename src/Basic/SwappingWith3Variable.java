package Basic;

public class SwappingWith3Variable {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("before Swapping:"+a+" "+b);
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("After Swapping:"+a+" "+b);
	}

}
