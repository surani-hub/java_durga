import java.util.Comparator;

class MyComparator implements Comparator{
	public int compare(Object obj1, Object obj2){
		
		/*
		String s1 = obj1.toString(); 
		String s2 = obj2.toString(); 
		
		return s2.compareTo(s1); 
		
	
		Integer i1 = (Integer)obj1;
		Integer i2 = (Integer)obj2;
		
		return i2.compareTo(i1);
		*/
		
		String s1 = obj1.toString(); // sudha
		String s2 = obj2.toString(); // rani
		
		if(s1.length()>s2.length()){
			return 100;
		}else if(s1.length()<s2.length()){
			return -10;
		} else{
			return s1.compareTo(s2);
		}
		
	}
}