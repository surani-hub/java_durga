class TestUtilityMethodParseXXX{
	public static void main(String[] args){
		/*
		Integer i = new Integer("100");
		Double d = new Double("100.93");
		Boolean b = new Boolean("true");
		*/
		
		System.out.println(Integer.parseInt("100"));
		System.out.println(Double.parseDouble("100.98"));
		System.out.println(Boolean.parseBoolean("true"));
		
		int i = Integer.parseInt("100", 2);
		byte b = Byte.parseByte("123", 8);
		short s = Short.parseShort("100", 10);
		long l = Long.parseLong("100",16);
		
		System.out.println(i);
		System.out.println(b);
		System.out.println(s);
		System.out.println(l);
		
	}
}