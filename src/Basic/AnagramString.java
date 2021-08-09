package Basic;

import java.util.Arrays;

public class AnagramString {
	public static void main(String[] args) {
		String str1 = "prince";
		String str2 = "nprice";
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		if(str1.length()!=str2.length())
		{
			System.out.println("Both the string is not anagram");
		}
		else {
			char[] string1 = str1.toCharArray();
			char[] string2  = str2.toCharArray();
			
			Arrays.sort(string1);
			Arrays.sort(string2);
			
			
			if(Arrays.equals(string1,string2)==true)
			{
				System.out.println("both string is anagram");
			}
			else {
				System.out.println("both the string is not anagram");
			}
		}
	}

}
