class Test{
/*
	public static void main(String[] args){
		
		System.out.println(m1());
	}
	
	public static int m1(){
		try{
			return 111;
		}catch(Exception e){
			return 222;
		} finally{
			return 333;
		}
	}
}
*/	
	public static void main(String[] args){
		try{
			//System.out.println(10/0);
			System.out.println("try block");
			System.exit(0);
		}catch(ArithmeticException ae){
			//ae.printStackTrace();
			//System.out.println(ae.getMessage());
			//System.out.println(ae.toString());
			System.out.println("catch block");
		}finally{
			System.out.println("finally block");
		}
	}
}
