class AutoBoxingDemo{
	
	/*
	static Integer i;
	static Integer a = 0;
	*/
	
	public static void main(String[] args){
		/*
		System.out.println(i); // null
		
		
		int ii = i;
		System.out.println(ii); // RE:NPE
		*/
		
		/*
		int b = a;
		System.out.println(b);
		System.out.println(a);
		*/
		
		Integer x = 10;
		Integer y = 10;
		++x;
		System.out.println(x);
		System.out.println(y);
		
		System.out.println(x == y);
		
	}
}