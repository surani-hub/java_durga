class AssertInsidePublic{
	int z = 5;
	
	public void stuff(int x){
		//assert(x<0):"print assert"; -- inappropriate usage
		
		switch(x){
			case 2: x = 3;
			default: assert(false);
		}
	}
	
	public static void main(String[] args){
		AssertInsidePublic p = new AssertInsidePublic();
		p.stuff(10);
	}
}


