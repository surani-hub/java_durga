class Demo{
	//final int x = 10;
	final int x;
/*	{
		x = 200;
	}	*/
	
	Demo(){
		x = 300;
	}
	public static void main(String[] args){
		//final int x = 10;
		String s = new String("java");
		StringBuffer sb = new StringBuffer("java");
		
		System.out.println(s.equals(sb));
		System.out.println(sb.equals(s));
		
		
	}
}