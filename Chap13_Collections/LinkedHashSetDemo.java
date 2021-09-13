import java.util.LinkedHashSet;
import java.util.Iterator;

class LinkedHashSetDemo{
	public static void main(String[] args){
		LinkedHashSet h = new LinkedHashSet();
		h.add(null);
		h.add("Dragon");
		h.add("Orange");
		h.add("Strawberry");
		h.add("Dragon");
		h.add(null);
		System.out.println(h.add("End"));
		System.out.println(h.add("Orange"));
		System.out.println(h);
		System.out.println(h.size());
		
		/*
		System.out.println("********************************************************8");
		Iterator itr = h.iterator();
		while(itr.hasNext()){
			//String s = (String)itr.next();
			//System.out.println(s);
			System.out.print(itr.next()+" ");
		}
		*/
	}
}