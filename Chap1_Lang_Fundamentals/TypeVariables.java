class TypeVariables{
	
	static int x = 10;
	int y = 20;
	
	public static void main(String[] args){
		TypeVariables t1 = new TypeVariables();
		t1.x = 888;
		t1.y = 999;
		
		TypeVariables t2 = new TypeVariables();
		
		System.out.println(t2.x+"   "+t2.y);
		
	}
}