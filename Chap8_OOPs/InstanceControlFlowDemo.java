class InstanceControlFlowDemo{
	
	int i = 10;
	
	{
		m1();
		System.out.println("first instance block");
	}
	
	InstanceControlFlowDemo(){
		System.out.println("Constructor");
	}
	
	public static void main(String[] args){
		InstanceControlFlowDemo d = new InstanceControlFlowDemo();
		System.out.println("main");
	}
	
	public void m1(){
		System.out.println(j);
	}
	
	{
		System.out.println("second instance block");
	}
	
	int j = 20;
}