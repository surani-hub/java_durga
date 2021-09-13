class Outer{
	
	int instanceVar = 10;
	static int staticVar = 200;
	
	class Inner{
		int instanceVar = 100;
		
		public void innerMethod(){
			
			int instanceVar = 1000;
			
			System.out.println("inner class method");
			System.out.println("calling instance variable of outer from inner class "+instanceVar); // 1000
			System.out.println("calling static variable of outer from inner class "+staticVar); // 200
			
			System.out.println(this.instanceVar); // 100
			System.out.println(Outer.this.instanceVar); // 10
			System.out.println();
			
		}
	}
	
	public void outerInstanceMethod(){
		System.out.println("outer class method");
		Inner i = new Inner();
		i.innerMethod();
	}
	
	public static void main(String[] args){
		System.out.println("Outer class main method");
		
		Outer o = new Outer();
		o.outerInstanceMethod();
		
		/*
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		i.innerMethod();
		*/
		
		/*
		Outer.Inner i = new Outer().new Inner();
		i.innerMethod();
		*/
		
	}
	
}