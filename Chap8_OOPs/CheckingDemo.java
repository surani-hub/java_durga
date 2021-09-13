class CheckingDemo{
	public static void main(String[] args){
		Object o = new String("ashok");
		System.out.println("hascode value is " + o.hashCode());
		//System.out.println(o.length());
		
		StringBuffer sb = (StringBuffer)o;
		System.out.println(sb);
		
	}
}