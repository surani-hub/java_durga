class TestingTypeCasting{
	public static void main(String[] args){
		
		System.out.println(10 > Float.NaN);
		System.out.println(10 < Float.NaN);
		System.out.println(10 >= Float.NaN);
		System.out.println(10 <= Float.NaN);
		System.out.println(10 == Float.NaN);
		System.out.println(Float.NaN == Float.NaN);
		
		System.out.println(10 != Float.NaN);
		System.out.println(Float.NaN != Float.NaN);
		
		String s = new String("Sudha");
		System.out.println(s == null);
		
		String str = null;
		System.out.println(str == null );
		
		System.out.println(null == null);
		
		TestingTypeCasting t = new TestingTypeCasting();
				
		
		/*
		byte a = 10;
		byte b = 20;
		
		byte c = (byte)(a + b);
		System.out.println(c);
		
		b = (byte)(b + 1);
		System.out.println(b); // 21
		
		b++;
		System.out.println(b); // 22
		
		
		System.out.println(-10/0.0); // -Infinity
		System.out.println(10/0.0); // Infinity
		//System.out.println(10/0); // RE:AE
		//System.out.println(0/0); // RE:AE
		System.out.println(0/0.0); // NaN
		System.out.println(-0/0.0); // NaN
		*/
		
	}
}