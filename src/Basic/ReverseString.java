package Basic;

public class ReverseString{
public static void main(String args[]){
String str = "Prince Kumar";
char CharArr[]= str.toCharArray();
for(int i = 0,j=CharArr.length-1;i<j;i++,j--)
{
	char temp = CharArr[i];
	CharArr[i] = CharArr[j];
	CharArr[j] = temp;
}
String rev = new String (CharArr);
System.out.println(rev);
}
}
