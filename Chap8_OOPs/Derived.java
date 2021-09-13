class Derived extends Base{
	static int x = 100;
	
	static{
		m2();
		System.out.println("derived first static block");
	}
	
	public static void main(String[] args){
		m2();
		System.out.println("derived main");
	}
	
	public static void m2(){
		System.out.println(y);
	}
	
	static{
		System.out.println("derived 
		second static block");
	}
	
	static int y = 200;
}