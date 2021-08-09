package Basic;

public class OccuranceArrayProgram {
	public static void main(String[] args) {
		int arr[] = {10,20,30,40,10,20,80,10,70};
		int element = 20;
		int count = 0;
		for(int i = 0;i<arr.length-1;i++)
		{
			if(arr[i]==element) {
			count++;
		}
		}
		if(count==0)
		{
			System.out.println("Element not found");
		}else{
			System.out.println("Element found" +count+ "times");
		}
		
	}

}
