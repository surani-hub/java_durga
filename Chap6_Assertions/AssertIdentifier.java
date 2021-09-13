class AssertIdentifier{
	public static void main(String[] args){
		//int assert = 10;
		//System.out.println(assert);
		
		int x = 10;
		;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
	//	assert(x>10):"Here x value should be greater than 10 but it's not";
	
	// 	assert(x == 10):++x;
	
	//	assert(x>10):methodOne();
		
		assert(x>10): methodTwo();
		
		;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
		System.out.println(x);
	}
	
/*	public static int methodOne(){
		return 999;
	}	*/
	
	public static void methodTwo(){
		System.out.println("void return type method not allowed");
	}
}