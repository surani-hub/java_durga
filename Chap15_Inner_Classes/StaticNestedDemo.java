class StaticNestedDemo{
	int instanceVar = 10;
	static int staticVar = 20;
	
	static class Nested{
		public void m1(){
			//System.out.println(instanceVar);
			System.out.println(staticVar);
			System.out.println("static nested class");
		}
		
		public static void main(String[] args){
			System.out.println("static nested main");
		}
	}
	
	public static void main(String[] args){
		Nested n = new Nested();
		n.m1();
		System.out.println("outer class");
	}
}