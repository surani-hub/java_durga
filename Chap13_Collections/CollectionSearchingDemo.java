import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class CollectionSearchingDemo{
	public static void main(String[] args){
	
	ArrayList l = new ArrayList();
	l.add("Z");
	l.add("A");
	l.add("M");
	l.add("K");
	l.add("a");
	
	System.out.println("before sorting "+ l); // [Z, A, M, K, a]
	
	Collections.sort(l, new MyComparator());
	
	System.out.println("after sorting "+ l); // [a,Z,M,K,A]
	
	System.out.println(Collections.binarySearch(l,"Z",new MyComparator())); // 1
	System.out.println(Collections.binarySearch(l,"O", new MyComparator())); // -3
	System.out.println(Collections.binarySearch(l,"S")); // unpredictable result
	
	/*
	System.out.println("before sorting "+ l); // [Z, A, M, K, a]
	
	Collections.sort(l);
	
	System.out.println("after sorting "+ l); // [A, K, M, Z, a]
	
	System.out.println(Collections.binarySearch(l,"Z")); // 3
	System.out.println(Collections.binarySearch(l,"O")); // -4
	*/
	
	}
}

class MyComparator implements Comparator{
	public int compare(Object obj1, Object obj2){
		String s1 = (String)obj1;
		String s2 = (String)obj2;
	
		return s2.compareTo(s1);
	}
}