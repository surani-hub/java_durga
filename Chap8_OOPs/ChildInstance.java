class ChildInstance extends ParentInstance{
	
	int x = 100;
	
	{
		m2();
		System.out.println("child first instance block");
	}
	
	ChildInstance(){
		System.out.println("child constructor");
	}
	
	public static void main(String[] args){
		ChildInstance p = new ChildInstance();
		System.out.println("child main");
	}
	
	public void m2(){
		System.out.println(y);
	}
	
	{
	System.out.println("child second instance block");
	}
	
	int y = 200;
	
}