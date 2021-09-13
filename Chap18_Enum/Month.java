enum Month{
	JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC;
	
	public void info(){
		System.out.println("calendar months");
	}
	
	public static void main(String[] args){
		System.out.println("enum can execute main method too");
		Month m = JAN;
		m.info();
		int count = 0;
		
		while(m != null){
			count++;
			m.info();
			System.out.println(count);
		}
	}
}
