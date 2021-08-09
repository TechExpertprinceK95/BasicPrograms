
public class Test {
	public static void main(String args[]) {
		int[] arr = {5,3,7,8,2,68,4,19};

		int largest = 0, second_largest = 0;

		for(int i = 0; i<arr.length; i++)
		        {
		           
		            if(arr[i] > largest)  
		            {
		                second_largest = largest; 
		                largest = arr[i]; 
		            }
		            else if(arr[i] > second_largest && arr[i] != largest)
		            {

		              second_largest = arr[i];
		            }
		         }
		        System.out.println("Largest:" + largest + "\nSecond largest:" + second_largest);
		}
		
	}


