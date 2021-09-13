class Test{
	
	public void m1(int i){
		System.out.println("integer");
	}
	
	public void m1(String i){
		System.out.println("string");
	}
	
	public void m1(double i){
		System.out.println("double");
	}
	
	public static void main(String[] args){
		Test t = new Test();
		
		t.m1(10);
		t.m1("durga");
		t.m1(10.29f);
	}
}