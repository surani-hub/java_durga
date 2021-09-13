class MethodLocalInnerClassDemo{
	public void outerClassMethod(){
		class Inner{
			public void innerMethod(int one, int two){
				System.out.println(one+two);
			}	
		}
		
		Inner i = new Inner();
		i.innerMethod(10,20);
		i.innerMethod(30,30);
		i.innerMethod(60,60);
	}
	
	public static void main(String[] args){
		MethodLocalInnerClassDemo m = new MethodLocalInnerClassDemo();
		m.outerClassMethod();
	}
}