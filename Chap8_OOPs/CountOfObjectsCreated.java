class CountOfObjectsCreated{
	static int count = 0;
	
	{
		count++;
	}
	
	CountOfObjectsCreated(){
	
	}
	
	CountOfObjectsCreated(int i){
		this("Rani");
	}
	
	CountOfObjectsCreated(String s){
		this(1000);
	}
	
	CountOfObjectsCreated(char c){
	
	}
	
	public static void main(String[] args){
		CountOfObjectsCreated c1 = new CountOfObjectsCreated();
		CountOfObjectsCreated c2 = new CountOfObjectsCreated(10);
		CountOfObjectsCreated c3 = new CountOfObjectsCreated("sudha");
		CountOfObjectsCreated c4 = new CountOfObjectsCreated('s');
		
		System.out.println(count);
		
		
		CountOfObjectsCreated c5 = new CountOfObjectsCreated();
		CountOfObjectsCreated c6 = new CountOfObjectsCreated("rani");
		
		System.out.println(count);
		
	}
}