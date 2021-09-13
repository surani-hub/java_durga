class ParentMethod{
	public static void main(String[] args){
		ChildMethod c = new ChildMethod();
		c.start();
		c.interrupt();
		
		for(int i=0;i<10;i++){
			System.out.println("main thread");
		}
	}
}