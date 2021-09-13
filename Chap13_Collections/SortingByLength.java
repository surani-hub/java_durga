import java.util.TreeSet;

class SortingByLength{
	public static void main(String[] args){
	
	TreeSet t = new TreeSet(new MyComparator());
	
	t.add(new StringBuffer("sudha"));
	t.add(new StringBuffer("rani"));
	t.add("one");
	t.add("two");
	t.add(new StringBuffer("pinky"));
	t.add(new StringBuffer("paaki"));
	t.add("three");
	t.add(new StringBuffer("chinni"));
	t.add("four");
	t.add("five");
	t.add("six");
	t.add(new StringBuffer("raja"));
	
	System.out.println(t); // one, six, two, five, four, raja, rani, chinni, paaki, pinky, sudha, three,
	
	}
}