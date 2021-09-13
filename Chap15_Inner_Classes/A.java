class A{
	class B{
		class C{
			public void m1(){
				System.out.println("C class method");
			}
		}
		
	/*	public void Bmethod(){
			System.out.println("B class method");
		//	C c = new C();
			c.m1(); 	//
		} 	*/
		
	/*	B.C c = b.new C();
		c.m1(); */
		C c = new C();
		c.m1();
	}
	
	public static void main(String[] args){
		System.out.println("A class ");
			A a = new A();
			A.B b = a.new B();
			//A.B.C c = b.new C();
			//c.m1();
			
		//	b.Bmethod();
			
	}
}