class AutoboxingConclusions{
	public static void main(String[] args){
		/*
		Integer x = new Integer(10);
		Integer y = new Integer(10);
		System.out.println(x == y);
		
		
		Integer x = new Integer(10);
		Integer y = 10;
		System.out.println(x == y); 
		
		Integer x = new Integer(10);
		Integer y = x;
		System.out.println(x == y); 
		
		Integer x = 10;
		Integer y = 10;
		System.out.println(x == y); 
		
		Integer x = 100;
		Integer y = 100;
		System.out.println(x == y); */
		
		Integer x = 1000;
		Integer y = 1000;
		System.out.println(x == y); // false
		System.out.println("-----------------------");
		
		Boolean b1 = true;
		Boolean b2 = true;
		System.out.println(b1 == b2); // true
		
		Boolean bb1 = false;
		Boolean bb2 = true;
		System.out.println(bb1 == bb2); // false
		
		Boolean bb11 = false;
		Boolean bb22 = false;
		System.out.println(bb11 == bb22);  // true
		
		System.out.println("-----------------------");
		
		Double d1 = 10.9;
		Double d2 = 10.9;
		System.out.println(d1 == d2); // false
	}
}	