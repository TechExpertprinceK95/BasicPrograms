package Basic;

public class EnhanceForLoop {
	public static void main(String[] args) {

	int arr[] = {10,20,50,10,20,30,50,77};
	System.out.println("Enhance for loop");
	for(int x:arr)
	{
		System.out.println(x);
	}
	System.out.println("Regular for loop");
	for(int i = 0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
	}
}


