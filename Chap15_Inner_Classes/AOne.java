class AOne{
	class BOne{
		class COne{
			public void m1(){
				System.out.println("C class method");
			}
		}
		
		COne c = b.new COne();
		c.m1();
	}
	
	public static void main(String[] args){
		System.out.println("A class ");
			AOne a = new AOne();
			AOne.BOne b = a.new BOne();		
	}
}