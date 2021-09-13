class TestGetClass // implements Cloneable
{
	public static void main(String[] args)// throws CloneNotSupportedException
	{
		
		Object o = new String("ashok");
		System.out.println(o.getClass().getName());
		
		String s1 = new String("sudha");
		String s2 = new String("sudha");
		s1.concat(" rani");
		System.out.println(s1); // sudha
		
		System.out.println(s1 == s2); // false
		System.out.println(s1.equals(s2)); // true
		
		StringBuffer sb1 = new StringBuffer("raja");
		StringBuffer sb2 = new StringBuffer("raja");
		sb1.append(" maali");
		System.out.println(sb1); // raja maali
		
		System.out.println(sb1 == sb2); // false
		System.out.println(sb1.equals(sb2)); // false
	}
}