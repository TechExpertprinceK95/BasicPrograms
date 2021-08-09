
public class MissingNumber {
		public static void main(String args[]){
		int arr[] = {41,42,43,44,45,47};
		int m = 41;
		int n = 47;
		int rangesum = 0;
		for(int i=m;i<=n;i++)
		{
		rangesum+=i;
		}
		int arrysum=0;
		for(int i=0;i<=arr.length-1;i++)
		{
		arrysum+=arr[i];
		}
		int missing = rangesum-arrysum;
		System.out.println(missing);
		}
		}
