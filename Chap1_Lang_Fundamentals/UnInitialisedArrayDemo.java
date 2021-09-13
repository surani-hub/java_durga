class UnInitialisedArrayDemo{
	
	//static int[] x;
	 
	static int[] x = new int[3];
	
	public static void main(String[] args){
		UnInitialisedArrayDemo t = new UnInitialisedArrayDemo();
		
		System.out.println(t.x);
		System.out.println(t.x[0]);
	
	}
}