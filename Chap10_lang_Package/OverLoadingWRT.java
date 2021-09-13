class OverLoadingWRT{
	
	/*
	public static void m1(long l){
		System.out.println("widening");
	}
	

	public static void m1(Integer l){
		System.out.println("autoboxing");
	}
	*/
	/*
	public static void m1(Long l){
		System.out.println("autoboxing");
	}
	*/
	/*
	public static void m1(int... l){
		System.out.println("var-arg");
	}
	*/
	
	public static void m1(Object o){
			System.out.println("first autoboxing  and then widening is possible");
	}
	
	public static void main(String[] args){
		 int x = 10;
		 
		 m1(x);
		
		
	}
}