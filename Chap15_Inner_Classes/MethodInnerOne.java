class MethodInnerOne{
	
	int instanceVar = 10;
	static int staticVar = 20;
	
	public static void outerMethod(){
		class Inner{
			public void innerMethod(){
			//  System.out.println(instanceVar);
				System.out.println(staticVar);
			}
		}
		
		Inner i = new Inner(); 
		i.innerMethod();
	}
	
	public static void main(String[] args){
		MethodInnerOne m = new MethodInnerOne();
		m.outerMethod();
	}
}