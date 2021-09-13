class Two{
	public static void main(String[] args){
		
		boolean assertOn = false;
		assert(assertOn):assertOn = true;
		if(assertOn){
			System.out.println("assert is on ");
		}
		
		//assert(false):"executes only when assert is false";
		
		//assert(args.length == 1);
	}
}