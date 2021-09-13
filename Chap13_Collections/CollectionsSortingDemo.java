import java.util.*;

public class CollectionsSortingDemo{
	public static void main(String[] args){
		List l = new ArrayList();
		l.add("Z");
		l.add("A");
		l.add("K");
		l.add("N");
		
		//l.add(new Integer(10));
		//l.add(null);
		
		System.out.println("before sorting " + l); // [Z, A, K, N]
		
		Collections.sort(l, new MyComparator());
		
		System.out.println("after sorting "+ l); //  [A, K, N, Z]
		
	}
}


class MyComparator implements Comparator{
	public int compare(Object obj1, Object obj2){
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		
		return s2.compareTo(s1);
		
	}
	
}