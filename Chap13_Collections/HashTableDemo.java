import java.util.Hashtable;
import java.util.Enumeration;

public class HashTableDemo{
	public static void main(String[] args){
		Hashtable d = new Hashtable(25);
		
		d.put(new Temp(10), "Ten");
		d.put(new Temp(8), "Eight");
		d.put(new Temp(9), "Nine");
		d.put(new Temp(6), "Six");
		d.put(new Temp(4), "Four");
		d.put(new Temp(7), "Seven");
		d.put(new Temp(5), "Five");
		d.put(new Temp(2), "Two");
		d.put(new Temp(1), "One");
		d.put(new Temp(3), "Three");
		d.put(new Temp(0), "Zero");
		d.put(new Temp(11), "Eleven");
		d.put(new Temp(16), "Sixteen");
		
		/*
		d.put("one", 1);
		d.put("two", 2);
		d.put("three", 3);
		d.put("four", 4);
		d.put("five", 5);
		d.put("six", 6);
		d.put("seven", 7);
		d.put("eight", 8);
		*/
		System.out.println(d);	
			
		System.out.println(d.keySet());	
		
		
		
		for(Enumeration e = d.keys(); e.hasMoreElements(); ){
			System.out.println(e.nextElement());
		}
	}	
}

class Temp{
	
	int i;
	Temp(int i){
		this.i = i;
	}
	
	/*
	public int hashCode(){
		return i;
	}
	*/

	public int hashCode(){
		return i%9;
	}
	// {8 =Eight, 16 =Sixteen, 7 =Seven, 6 =Six, 5 =Five, 4 =Four, 3 =Three, 11 =Eleven, 2 =Two, 1 =One, 10 =Ten, 0 =Zero, 9 =Nine}
	
	/*
	public int hashCode(){
		return i; 
	} 
	// {16 =Sixteen, 11 =Eleven, 10 =Ten, 9 =Nine, 8 =Eight, 7 =Seven, 6 =Six, 5 =Five, 4 =Four, 3 =Three, 2 =Two, 1 =One, 0 =Zero}
	
	
	public int hashCode(){
		return i%11; 
	} 
	// {10 =Ten, 9 =Nine, 8 =Eight, 7 =Seven, 6 =Six, 16 =Sixteen, 5 =Five, 4 =Four, 3 =Three, 2 =Two, 1 =One, 11 =Eleven, 0 =Zero}
	*/
	public String toString(){
		return i+ " ";
	}
}