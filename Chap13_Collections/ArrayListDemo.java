import java.util.ArrayList;
import java.util.RandomAccess;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.Iterator;


class ArrayListDemo{
	public static void main(String[] args){
		
		/*
		ArrayList m = new ArrayList();
		m.add("Fruit");
		m.add("Banana");
		m.add("Apple");
		m.add("Melon");
		m.add("Sapota");
		m.add("Lime");
		m.add("Orange");
		
		System.out.println(m instanceof Serializable);
		System.out.println(m instanceof Cloneable);
		System.out.println(m instanceof RandomAccess); // only ArrayList and vector implements RandomAccess interface.
		
		System.out.println("*****************************************8");
		
		LinkedList l2 = new LinkedList();
		System.out.println(l2 instanceof RandomAccess); // false
		System.out.println(l2 instanceof Serializable);
		System.out.println(l2 instanceof Cloneable);
		
		ArrayList l = new ArrayList();
		l.add("A");
		l.add(10);
		l.add("A");
		l.add(null);
		l.add(10.9);
		l.add('d');
		
		System.out.println(l);
		
		l.remove("A");
		System.out.println(l);
		
		l.remove(null);
		System.out.println(l);
		 
		l.remove(1);
		System.out.println(l);
		
		l.add(2, "sudha");
		System.out.println(l);
		
		System.out.println("*****************************************8");
		
		System.out.println(l.contains("A"));
		System.out.println(l.get(2));
		System.out.println(l.indexOf("sudha"));
		
		//l.clear();
		//System.out.println(l);
		System.out.println(l.isEmpty());
		
		/*
		l.add(m);
		System.out.println(l);
		
		System.out.println(l.retainAll(m));
		System.out.println(l);
		
		
		System.out.println("*****************************************8");
		
		System.out.println(l.set(2, "rani"));
		System.out.println(l);
		*/	

		ArrayList list = new ArrayList();
		
		for(int i = 0; i<=10;i++){
			list.add(i);
		}
		
		System.out.println(list);
		
		Iterator itr = list.iterator();
		while(itr.hasNext()){
			Integer value = (Integer)itr.next();
			if(value%2 != 0){
				//System.out.println(value);
				itr.remove();
			} 
			
		/*	else{
				itr.remove();
			} */
			
		}
		System.out.println("even numbers are: " +list );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}