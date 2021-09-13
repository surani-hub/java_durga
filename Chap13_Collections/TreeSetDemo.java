import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

class TreeSetDemo{
	public static void main(String[] args){
		
		
	/*	LinkedHashSet h = new LinkedHashSet();
		h.add(null);
		h.add("Dragon");
		h.add("Strawberry");
		h.add("Orange");
		*/
		
		/*
		TreeSet t = new TreeSet();
		t.add(null);
		t.add("one");
		t.add("two");
		t.add("three");
		t.add("four");
		//t.add(null);
		t.add("five");
		t.add("six"); */
		
		//t.add(new Integer(10));
		//System.out.println(t);
		
		/*
		System.out.println(t.subSet("Orange","four"));
		System.out.println(t.subSet("Orange", false, "four", true));
		
		System.out.println(t.tailSet("five")); //five,four,one,six,three,two
		System.out.println(t.tailSet("five", true)); //
		System.out.println(t.tailSet("five", false)); // four,one,six, three, two		
		
		System.out.println("*****************************************************");
		
		SortedSet sortedSet = t.subSet("Orange","four"); // Orange, Strawberry, five
		System.out.println("subset is " + sortedSet);
		NavigableSet navigableSet = t.subSet("Orange", false, "four", true); // Strawberry, five, four
		System.out.println("navigable set is " + navigableSet);
		*/
		
		/*
		System.out.println(t.headSet("five"));
		System.out.println(t.headSet("five", true));
		
		System.out.println("higher is " + t.higher("five"));
		System.out.println("lower is " + t.lower("five"));
		
		System.out.println("***************************************************");
		
		System.out.println("removes first element " + t.pollFirst());
		System.out.println(t);
		
		System.out.println("removes last element " + t.pollLast());
		System.out.println(t);
		*/
		
		/*
		System.out.println("ceilling values are : ");
		System.out.println(t.ceiling("seven"));
		System.out.println(t.ceiling("zebra"));
		System.out.println(t.ceiling("you"));
		
		System.out.println("floor values are : ");
		System.out.println(t.floor("seven"));
		System.out.println(t.floor("zebra"));
		System.out.println(t.floor("you"));
		
		System.out.println("***************************************************");
		
		Iterator itr = t.descendingIterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		System.out.println("first element is " + t.first());
		System.out.println("last element is " + t.last());
		
		System.out.println("******************************");
		
		NavigableSet set = t.descendingSet();
		System.out.println(set);
		*/
		
		/*
		TreeSet t = new TreeSet();
		//t.add(null);
		//t.add("sudha");
		//t.add("rani");
		
		/*
		t.add(new StringBuffer("sudha"));
		t.add(new StringBuffer("rani"));
		t.add(new StringBuffer("pinky"));
		t.add(new StringBuffer("paaki"));
		t.add(new StringBuffer("chinni"));
		t.add(new StringBuffer("raja"));
		
		
		t.add(new StringBuilder("sudha"));
		t.add(new StringBuilder("rani"));
		t.add(new StringBuilder("pinky"));
		t.add(new StringBuilder("paaki"));
		t.add(new StringBuilder("chinni"));
		t.add(new StringBuilder("raja"));
		
		//t.add(10.24);
		
		System.out.println(t);
		*/
		
		TreeSet t = new TreeSet();
	/*	t.add(10);
		t.add(5);
		t.add(0);
		t.add(10);
		
		System.out.println(t); // 0,5,10 */
		
		t.add(new StringBuffer("sudha"));
		t.add(new StringBuffer("rani"));
		t.add(new StringBuffer("pinky"));
		t.add(new StringBuffer("paaki"));
		t.add(new StringBuffer("chinni"));
		t.add(new StringBuffer("raja"));
		
		System.out.println(t); // chinni, paaki, pinky, raja, rani, sudha
		
	}
}