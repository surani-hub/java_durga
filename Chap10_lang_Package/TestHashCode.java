class TestHashCode{
	int i;
	
	TestHashCode(int i){
		this.i = i;
	}
	
	public int hashCode(){
		return i;
	}
	
	public String toString(){
		return i+"";
	}
	
	public static void main(String[] args){
		TestHashCode t1 = new TestHashCode(10);
		TestHashCode t2 = new TestHashCode(100);
		TestHashCode t3 = new TestHashCode(1000);
		
		TestHashCode t4 = t3;
		
		TestHashCode t5 = new TestHashCode(10);
		
		System.out.println(t1 == t5); // false
		System.out.println(t1.hashCode() == t5.hashCode()); // true
		System.out.println(t1.hashCode()); // 10
		System.out.println(t5.hashCode()); // 10
		
		
		/*
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		System.out.println(t3.hashCode());
		
		System.out.println(t1.hashCode() == t2.hashCode()); //false
		System.out.println(t1.equals(t2)); // false
		
		
		System.out.println(t3.hashCode());
		System.out.println(t4.hashCode());
		
		System.out.println(t3.equals(t4));
		System.out.println(t3.hashCode() == t4.hashCode());
		*/
		
	}
	
}