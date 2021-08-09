package Basic;

public class ArrayAscendingOrder {
	public static void main(String[] args) {
		int arr[] = {10,30,20,5,50,40,80,1,60,70};
		for(int x:arr)
			System.out.println(x+" ");
		System.out.println();
		
		for(int i=0;i<=arr.length-2;i++)
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					for(int x:arr)
					{
						System.out.println(x+" ");
						System.out.println();
					}
				}
			}
	}
	

}
