class TestUtilityMethodValueOf{
	public static void main(String[] args){
		
		Integer i = Integer.valueOf("10");
		Double d = Double.valueOf("10.7");
		Float f = Float.valueOf("19.23f");
		Boolean b = Boolean.valueOf("true");
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(f);
		System.out.println(b);
		System.out.println("-----------------------------------------");
		
		Integer i1 = Integer.valueOf(10);
		Double d1 = Double.valueOf(10.7);
		Float f1 = Float.valueOf(19.23f);
		Boolean b1 = Boolean.valueOf(true);
		Character c1 = Character.valueOf('a');
		
		System.out.println(i1);
		System.out.println(d1);
		System.out.println(f1);
		System.out.println(b1);
		System.out.println(c1);
		System.out.println("-----------------------------------------");
		
		Integer ii = Integer.valueOf("100",2); //1*4+2*2+3*1 = 4+4+3 = 11 - wrong for 123 number
		Byte ib = Byte.valueOf("123",8); // 1*64+2*8+3*1 = 64+16+3 = 83
		Short is = Short.valueOf("100", 10);
		Long il = Long.valueOf("100", 16);
		//Float ff = Float.valueOf("100", 10); //-no such method for float,char,double
		
		System.out.println(ii);
		System.out.println(ib);
		System.out.println(is);
		System.out.println(il);
		//System.out.println(ff);
		
	}
}