package Basic;

public class CountCharactor {
	public static void main(String[] args) {
		String str = "Hello i m PrinceKumar";
	    char charr[] = str.toCharArray();
	    int Words = 1;
	    for(int i =0;i<=charr.length-1;i++)
	    {
	    	if(charr[i]==' 
	    			')
	    	{
	    		Words++;
	    	}
	    }
	    		System.out.println("Counts of Words is:"+Words);
	    	}
	    }
