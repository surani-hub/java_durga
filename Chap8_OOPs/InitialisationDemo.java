public class InitialisationDemo{
	
	private static String m1(String msg){
		System.out.println(msg);
		return msg;
	}
	
	/*
	private static void m1(String msg){
		System.out.println(msg);
	}
	*/
	
	public InitialisationDemo(){
		m = m1("1");
	}
	
	{
		m = m1("2");
	}
	

		String m = m1("3");
	
	public static void main(String[] args){
		Object o = new InitialisationDemo();
	}
}