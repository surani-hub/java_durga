class TestUtilityMethodToString{
	public static void main(String[] args){
	
	/*
	Integer i = Integer.valueOf("100");
	System.out.println(i);
	System.out.println(i.toString());
	
	int i1 = Integer.parseInt("1000");
	System.out.println(i1);
	
	System.out.println("--------------------------------------");
	
	System.out.println(Integer.toString(12));
	System.out.println(Double.toString(18.45));
	System.out.println(Boolean.toString(true));
	System.out.println(Character.toString('a'));
	System.out.println(Float.toString(23.46f));
	
	System.out.println("-----------------------------------");
	
	String s1 = Integer.toString(7,2);
	String s2 = Integer.toString(17,2);
	System.out.println(s1);
	System.out.println(s2);
	
	System.out.println(Long.toString(7,2));
	System.out.println(Long.toString(17,2));
	*/
	
	System.out.println(Integer.toBinaryString(7));
	System.out.println(Integer.toOctalString(10));
	System.out.println(Integer.toHexString(20));
	
	System.out.println(Long.toBinaryString(7));
	System.out.println(Long.toOctalString(10));
	System.out.println(Long.toHexString(20));
	
	
	/*
	// pgm to check whether pointing to same object (when range is between 0 to 127) or different object out of range
	Integer i = Integer.valueOf("100");
	Integer ii = Integer.valueOf("100");
	System.out.println(i == ii);
	
	Integer i1 = Integer.valueOf("1000");
	Integer i2 = Integer.valueOf("1000");
	System.out.println(i1 == i2);
	
	System.out.println("--------------------------------------");
	
	Byte ib = Byte.valueOf("100");
	Byte iib = Byte.valueOf("100");
	System.out.println(ib == iib);
	
	Byte ib1 = Byte.valueOf("127");
	Byte ib2 = Byte.valueOf("127");
	System.out.println(ib1 == ib2);
	
	System.out.println("--------------------------------------");
	
	Short is = Short.valueOf("100");
	Short iis = Short.valueOf("100");
	System.out.println(is == iis);
	
	Short is1 = Short.valueOf("1000");
	Short is2 = Short.valueOf("1000");
	System.out.println(is1 == is2);
	
	System.out.println("--------------------------------------");
	
	Long il = Long.valueOf("100");
	Long iil = Long.valueOf("100");
	System.out.println(il == iil);
	
	Long il1 = Long.valueOf("1000");
	Long il2 = Long.valueOf("1000");
	System.out.println(il1 == il2);
	
	System.out.println("--------------------------------------");
	
	Double id = Double.valueOf("100");
	Double iid = Double.valueOf("100");
	System.out.println(id == iid); // false
	
	Double id1 = Double.valueOf("1000");
	Double id2 = Double.valueOf("1000");
	System.out.println(id1 == id2); // false
	*/
	
	}
}