import java.util.LinkedList;
import java.util.ListIterator;

class LinkedListDemo{
	public static void main(String[] args){
	
	LinkedList l = new LinkedList();
		
		System.out.println(l.capacity());
		l.add("A");
		l.add(10);
		l.add("A");
		l.add(null);
		l.add(10.9);
		l.add('d');
		
		
		System.out.println(l);
		System.out.println(l.remove(2));
		System.out.println(l);
		
		System.out.println(l.remove("A"));
		System.out.println(l);
		
		System.out.println(l.remove());
		System.out.println(l);
		
		System.out.println(l.removeFirst());
		System.out.println(l);
		
		System.out.println(l.removeLast());
		System.out.println(l);
		
		System.out.println(l.size());
		
		
		/*
		ListIterator itr = l.listIterator();
		
		
		while(itr.hasNext()){
				System.out.println(l.pop());
				
		}
		
		System.out.println(l);
		
		l.clear();
		
		while(l.isEmpty()){
			l.push("sudha");
			l.push("rani");
			l.push("muddu");
			l.push("bangara");
			l.push("shonu");
			
			System.out.println(l);
		}
		*/
		
		//System.out.println(l);	
		
		
		/*
		System.out.println(l.pop());
		l.push("sudha");
		
		System.out.println(l);
		
		l.add(2,"sudha");
		l.addFirst("second chance");
		l.addLast("first chance");
		
		System.out.println(l);
		
		
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		
		System.out.println(l.element());
		System.out.println(l);
		
		
		System.out.println(l.indexOf(10));
		System.out.println(l.lastIndexOf("A"));
		

		l.offerFirst("first element");
		l.offerLast("lastTwo element");
		l.offer("lastOne element");
		System.out.println(l);
		
		//l.peek();
		System.out.println(l.peek());
		System.out.println(l.peekFirst());
		System.out.println(l.peekLast());
		System.out.println(l);
		
		
		l.clear();
		System.out.println(l.peek());
		System.out.println(l.peekFirst());
		System.out.println(l.peekLast());
		System.out.println(l);
		
		
		System.out.println(l.poll());
		System.out.println(l); 
		
		System.out.println(l.pollFirst());
		System.out.println(l);
		
		System.out.println(l.pollLast());
		System.out.println(l);
		
		l.clear();
		System.out.println(l.poll());
		System.out.println(l.pollFirst());
		System.out.println(l.pollLast());
		System.out.println(l);
		*/
				
		System.out.println("*********************************************");
		
	LinkedList m = new LinkedList();
		m.add("Fruit");
		m.add("Banana");
		m.add("Apple");
		m.add("Melon");
		m.add("Sapota");
		m.add("Lime");
		m.add("Orange");
	
		System.out.println(m);
/*
//		l.add(m);
		l.addAll(m);
		System.out.println(l);
		l.addAll(2,m);
		System.out.println(l);
	*/
	
	}
}