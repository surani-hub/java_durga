import java.util.*;
import java.util.HashMap;
import java.util.Set;
import java.util.Collection;
//import java.util.Map.Entry;
import java.util.Iterator;

class HashMapDemo{
	public static void main(String[] args){
		HashMap m = new HashMap();
		
		//System.out.println(m.isEmpty());
		
		m.put(100,"sudha");
		m.put(200,"rani");
		m.put(300, "raja");
		m.put(400,"chinni");
		m.put(500,"paaki");
		m.put(600, "pinky");
		
		System.out.println(m);
		
		
		m.replace(600, "grandPa");
		System.out.println(m);
		
		
		m.replace(600, "grandPa", "pinky");
		System.out.println(m);
		
		System.out.println(m.size());
				
		
		/*
		m.remove(600);
		System.out.println(m);
		
		m.remove(300,"raja");
		System.out.println(m);
		*/
		
		/*
		System.out.println(m.putIfAbsent(700, "grandMa")); //null
		
		System.out.println(m);
		System.out.println(m.putIfAbsent(600, "grandMa")); // pinky
		System.out.println(m);
		*/
		
		/*
		Set s = m.keySet();
		System.out.println(" keys "+s);
		
		Collection c = m.values();
		System.out.println("values "+c);
		
		Set s1 = m.entrySet();
		System.out.println("key and value are "+ s1);
		
		System.out.println(m.containsKey(400));
		System.out.println(m.containsValue("pinky"));
		
		System.out.println(m.get(600));
		
		System.out.println(m.isEmpty());
		*/
		
		/*
		Iterator itr = s1.iterator();
		while(itr.hasNext()){
			Map.Entry m1 = (Map.Entry)itr.next();
			System.out.println(m1.getKey());
			System.out.println(m1.getValue());
			
			if(m1.getKey().equals(100)){
				m1.setValue("Happiest");
			}
		}
		System.out.println(m);
		*/
		
		/*
		m.put(600, "unknown");
		System.out.println(m);
		
		System.out.println(m.put(400, "pinky"));
		System.out.println(m);
		
		System.out.println("**********************************************************");
		
		m.put(600, "pinky");
		System.out.println(m);
		
		m.put(null, "grandPa");
		System.out.println(m);
		
		m.put(600, null);
		System.out.println(m);
		
		m.put(400, null);
		System.out.println(m);
		
		m.put(200, null);
		System.out.println(m);
		*/

	}
}