import java.util.IdentityHashMap;

class IdentityHashMapDemo{
	public static void main(String[] args){
		
		IdentityHashMap m = new IdentityHashMap();
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		m.put(i1,"sudha");
		m.put(i2,"rani");
		
		
		System.out.println(m);
		
	}
}