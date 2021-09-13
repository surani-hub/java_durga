class MethodInner{
	
	int instanceVar = 10;
	static int staticVar = 20;
	
	public void outerMethod(){
		 int outerInstanceVar = 100;
		
		class Inner{
			public void innerMethod(){
				System.out.println(instanceVar);
				System.out.println(staticVar);
				System.out.println(outerInstanceVar);
			}
		}
		
		Inner i = new Inner(); 
		i.innerMethod();
	}
	
	public static void main(String[] args){
		MethodInner m = new MethodInner();
		m.outerMethod();
	}
}