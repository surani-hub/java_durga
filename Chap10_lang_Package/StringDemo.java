class StringDemo{
	public static void main(String[] args){
		
		String name = new String("sudha");
		String name1 = name.intern();
		
		String name2 = "sudha";
		
		System.out.println(name1 == name2);		
		
		/*
		String s1 = new String("you can catch me");
		String s2 = new String("you can catch me");
		System.out.println(s1 == s2 ); // false
		
		String s3 = "you can catch me";
		System.out.println(s1 == s3); // false
		
		String s4 = "you can catch me";
		System.out.println(s3 == s4); // true
		
		// check the answer and reason for it.
		String s5 = "you can " + "catch me";
		System.out.println(s3 == s5); // true as per durga sir notes, however, it's false as per cmd output -- got it coz space is missing after 'can'.
		
		String s6 = "you can";
		String s7 = s6 + " catch me";
		System.out.println(s3 == s7); // false
		
		final String s8 = "you can";
		String s9 = s8 + " catch me";
		System.out.println(s3 == s9); // true
		
		System.out.println(s6 == s8); // true
		//System.out.println(s1 == s2);
		*/
		
		/*
		String str = new String("Bhaskar");
		String str2 = str.intern();
		
		System.out.println(str == str2); // false
		
		String strN = "Bhaskar";
		System.out.println(str2 == strN); // true
		*/
		
	}
}