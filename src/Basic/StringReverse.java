package Basic;
	public static void main(String[] args) {
		String str = "Prince Kumar";
		StringReverse obj = new StringReverse();
		obj.reverse(str);
	}

	 class StringReverse{
		void reverse(String str) {
			if(str==null)||(str.length()<=1)
				System.out.println(str);
			else {
					System.out.println(str.charAt(str.length()-1));
					reverse(str.substring(0,str.length()-1));
				}
		}
	 }
	
