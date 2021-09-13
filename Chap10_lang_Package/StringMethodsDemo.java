class StringMethodsDemo{
	public static void main(String[] args){
		
		/*
		String s1 = "bhaskar";
		String s2 = s1.toUpperCase();
		String s3 = s1.toLowerCase();
		
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		
		String s4 = s1.toString();
		System.out.println(s1==s4);
		*/
		
		String s1 = new String("ashok");
		String s2 = s1.toString();
		String s3 = s1.toUpperCase();
		String s4 = s1.toLowerCase();
		String s5 = s1.toUpperCase();
		String s6 = s1.toLowerCase();
		
		System.out.println(s3); // ASHOK
		System.out.println(s3==s5); // false
		System.out.println(s4==s6); //true
		System.out.println(s2==s4); // true
		System.out.println(s1==s4); //true 
		System.out.println(s1==s2); // true
		
		System.out.println(s1==s6); // true
		
		//String s = "    ashoksoft     ";
		//System.out.println(s.charAt(3));
		//System.out.println(s.charAt(100));
		
		//s = s.concat("software");
		//System.out.println(s);
		
		//System.out.println(s.equals("Ashok"));
		//System.out.println(s.equalsIgnoreCase("ASHOK"));
		
		/*
		System.out.println(s.substring(5));
		System.out.println(s.substring(3,7));
		
		System.out.println(s.length());
		System.out.println(s.toUpperCase());
		
		System.out.println(s.toLowerCase());
		
		System.out.println(s);
		System.out.println(s.trim());
		*/
		
		/*
		String s = "ababba";
		System.out.println(s.replace('a','z'));
		
		System.out.println(s.indexOf('b'));
		System.out.println(s.indexOf('z'));
		
		System.out.println(s.lastIndexOf('b'));
		System.out.println(s.lastIndexOf('z'));
		*/	
	}
}