package Basic;

public class MaxArray {
	public static void main(String[] args) {
		int arr[] = {-25, 1, 0, -98, 98, 256};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[0] < arr[i])
			{
				int temp = arr[0];
				arr[0] = arr[i];
				arr[i] = temp;
			}
		}
		for(int x:arr)
		
			System.out.println(x+" ");
			System.out.println();
			System.out.println("Max:"+arr[0]);
		}
}
