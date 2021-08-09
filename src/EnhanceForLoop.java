
public class EnhanceForLoop {
	public static void main(String[] args) {
		int arr[] = {12,22,44,66,77,66,87,99};
		System.out.println("Normal For Loop");
		for(int i = 0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Enhance For Loop");
		for(int x : arr)
		{
			System.out.println(x);
		}
	}

}
