import java.util.PriorityQueue;
import java.util.Comparator;

public class PriorityQueueDemo{
	public static void main(String[] args){
		
		PriorityQueue pq = new PriorityQueue(new MyComparator());
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		//pq.offer(null);
		
		//System.out.println(pq.element());
		//System.out.println(pq.remove());
		
		pq.add("a");
		pq.add("b");
		pq.add("c");
		pq.add("d");
		pq.add("e");
		pq.add("f");
		pq.add("g");
		pq.add("h");
		
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		
	}
}

class MyComparator implements Comparator{
	public int compare(Object obj1, Object obj2){
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		
		return s2.compareTo(s1);
	}
	
}