class StaticDemo{
	
	/*
	static{
		System.out.println(x);
	}
	
	static int x = 10;
	*/
	
	static{
		m1();
	}
	
	public static void m1(){
		System.out.println(x);
	}
	
	static int x = 10;
	
	public static void main(String[] args){
			System.out.println("last one to execute");
	}
}