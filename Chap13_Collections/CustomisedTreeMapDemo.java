import java.util.TreeMap;
import java.util.Comparator;

public class CustomisedTreeMapDemo{
	public static void main(String[] args){
		TreeMap t = new TreeMap(new MyComparator());

		t.put(100,"sudha");
		t.put(300,"rani");
		t.put(200, "raja");
		t.put(500,"chinni");
		t.put(600,"paaki");
		t.put(400, "pinky");
		
		System.out.println(t);
	}
}

class MyComparator implements Comparator{
	
	public int compare(Object obj1, Object obj2){
			Integer s1 = (Integer)obj1;
			Integer s2 = (Integer)obj2;
			
			return s2.compareTo(s1);
			
	}
}