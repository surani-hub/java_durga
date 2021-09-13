import java.util.TreeSet;

class TreeSetUsingComparator{
	public static void main(String[] args){
		
		TreeSet t = new TreeSet(new MyComparator());
	/*	t.add(new StringBuffer("sudha"));
		t.add(new StringBuffer("rani"));
		t.add(new StringBuffer("pinky"));
		t.add(new StringBuffer("paaki"));
		t.add(new StringBuffer("chinni"));
		t.add(new StringBuffer("raja"));
		
		//System.out.println(t); // chinni, paaki, pinky, raja, rani, sudha
		System.out.println(t); // sudha, rani, raja, pinky, paaki, chinni
	
		t.add(10);
		t.add(5);
		t.add(0);
		t.add(10);
		
		System.out.println(t); // 0,5,10
		//System.out.println(t); // 10,5,0
		*/
		
		t.add("one");
		t.add("two");
		t.add("three");
		t.add("four");
		t.add("five");
		t.add("six");
		
		System.out.println(t); // five, four, one, six, three, two, 
	}
}