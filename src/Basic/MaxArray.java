package Basic;

public class MaxArray {
	public static void main(String[] args) {
	   int arr[] = {7,8,6,11,22,33,44};
	   int max = arr[0];
	   for(int i=1;i<arr.length;i++)
	   {
		   max = arr[i];
	   }
	   System.out.println("maximum element is "+max);
	}

}
