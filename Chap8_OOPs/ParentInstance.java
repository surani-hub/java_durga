class ParentInstance{
	
	int i = 10;
	
	{
		m1();
		System.out.println("parent instance block");
	}
	
	ParentInstance(){
		System.out.println("parent constructor");
	}
	
	public static void main(String[] args){
		ParentInstance p = new ParentInstance();
		System.out.println("parent main");
	}
	
	public void m1(){
		System.out.println(j);
	}
	
	int j = 20;
}

// 0
// parent instance block
// parent constructor
// parent main