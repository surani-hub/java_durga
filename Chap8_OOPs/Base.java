class Base{
	static int i = 0;
	static{
		m1();
		System.out.println("base static block");
	}
	
	public static void main(String[] args){
		m1();
		System.out.println("base main");
	}
	
	public static void m1(){
		System.out.println(j);
	}
	
	static int j = 20;
}
