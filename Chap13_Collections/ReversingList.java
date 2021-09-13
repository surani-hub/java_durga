import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class ReversingList{
	public static void main(String[] args){
		ArrayList l = new ArrayList();
		l.add(15);
		l.add(0);
		l.add(20);
		l.add(10);
		l.add(5);
		
		/*
		System.out.println(l); // [15,0,20,10,5]
		
		Collections.reverse(l);
		
		System.out.println(l); // [5,10,20,0,15]
		*/
		
		System.out.println(l); // [15,0,20,10,5]
		
		Collections.reverseOrder(new MyComparator());
		
		System.out.println(l); // [15,0,20,10,5]
	}
}


class MyComparator implements Comparator{
	public int compare(Object obj1, Object obj2){
		Integer i1 = (Integer)obj1;
		Integer i2 = (Integer)obj2;
		
		return i2.compareTo(i1);
		
	}
}
