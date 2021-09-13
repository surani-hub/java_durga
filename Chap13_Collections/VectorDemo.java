import java.util.Vector;
import java.io.Serializable;
import java.util.RandomAccess;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;



class VectorDemo{
	public static void main(String[] args){
		
		/*
		Vector m = new Vector();
		System.out.println("initial capactity: "+ m.capacity());
		m.add("Fruit");
		m.add("Banana");
		m.add("Apple");
		m.add("Melon");
		m.add("Sapota");
		m.add("Lime");
		m.add("Orange");
		m.add("Strawberry");
		m.add("Dragon");
		m.add("Pear");
		m.add("Guava");
		System.out.println(m);
		System.out.println("current capactity: "+ m.capacity());
		
		m = new Vector(30);
		System.out.println("specified capactity: "+ m.capacity());
		
		Vector m = new Vector(12, 10);
		System.out.println("initial capactity: "+ m.capacity());
		m.add("Fruit");
		m.add("Banana");
		m.add("Apple");
		m.add("Melon");
		m.add("Sapota");
		m.add("Lime");
		m.add("Orange");
		m.add("Strawberry");
		m.add("Dragon");
		m.add("Pear");
		m.add("Guava");
		
		m.add("Flower");
		m.add("Sweet");
		m.add("Salt");
		m.add("bitter");
		m.add("good");
		m.add("best");
		System.out.println("incremental capactity: "+ m.capacity());
		*/
		
		/*
		Vector m = new Vector();
		m.add("Fruit");
		m.add("Banana");
		m.add("Apple");
		m.add("Melon");
		m.add("Sapota");
		System.out.println("m collection: " +m);
		
		System.out.println(m instanceof Serializable);
		System.out.println(m instanceof Cloneable);
		System.out.println(m instanceof RandomAccess);
		
		System.out.println("-----------------------------------------------------------------");
		
		Vector n = new Vector(m);
		n.add("Lime");
		n.add("Orange");
		n.add("Strawberry");
		n.add("Dragon");
		n.add("Pear");
		n.add("Guava");
		System.out.println("n collection after adding m: "+n);
		*/
		
		/*
		Vector n = new Vector();
		n.add("Lime");
		n.add("Orange");
		n.add("Strawberry");
		n.add("Dragon");
		n.addElement("End");
		
		n.insertElementAt("second", 1);
		System.out.println(n);
		
		System.out.println(n.removeElement("Lime"));
		n.removeElementAt(1);
		
		/*
		System.out.println(n.firstElement());
		
		System.out.println(n.elementAt(1));
		
		for(Enumeration e= n.elements(); e.hasMoreElements();){
			System.out.print(" "+e.nextElement());
		}
		
		System.out.println();
		System.out.println("*****************************************");
	
		
		System.out.println("************************************8");
		for(Iterator itr=n.iterator(); itr.hasNext();){
			System.out.println(itr.next());
			
			itr.remove();
			System.out.println(n);
		}
		
		System.out.println(n);
		/*
		for(ListIterator itr=n.listIterator(); itr.hasNext();){
			System.out.println(itr.next());
		}
		*/
		
		Vector n = new Vector();
		n.add("Dragon");
		n.add("Orange");
		n.add("Strawberry");
		n.add("Dragon");
		n.addElement("End");
		System.out.println(n);
		
		ListIterator list = n.listIterator();
		while(list.hasNext()){
			String s = (String)list.next();
			
			if(s.equals("Dragon")){
				//list.remove();
				//list.set("Budda");
				list.add("paaki");
			}
		}
		System.out.println(n);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}