class TestClone implements Cloneable{
	
	int i = 10;
	int j = 20;
	
	public static void main(String[] args) throws CloneNotSupportedException{
		TestClone t1 = new TestClone();
		TestClone t2 = (TestClone)t1.clone();
		
		System.out.println(t1.i +"  " + t1.j);
		System.out.println(t2.i +"  " + t2.j);
		
		t2.i = 100;
		t2.j = 200;
		
		System.out.println("After cloning, the values are : " + t2.i +"  " + t2.j);
	}
}