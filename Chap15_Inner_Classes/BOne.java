class BOne{
		class COne{
			public void m1(){
				System.out.println("C class method");
			}
		}
		
	public static void main(String[] args){
		BOne b = new BOne();
		BOne.COne c = b.new COne();
		c.m1();
	}
}