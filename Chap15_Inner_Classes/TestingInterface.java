class TestingInterface implements OuterInterface.InnerInterface{
	public void innerMethod(){
		System.out.println("implement only inner interface method");
	}
	
	public static void main(String[] args){
		TestingInterface t = new TestingInterface();
		t.innerMethod();
	}
}
/*
class TestingInterface implements OuterInterface{
	public void outerMethod(){
		System.out.println("implement only outer interface method");
	}
	
	public static void main(String[] args){
		TestingInterface t = new TestingInterface();
		t.outerMethod();
	}
}
*/