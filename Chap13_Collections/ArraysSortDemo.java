import java.util.Arrays;
import java.util.Comparator;

class ArraysSortDemo{
	public static void main(String[] args){
		
		int[] a = {10,20,30,40,100,50,200};
		
		System.out.println("before sorting");
		for(int a1:a){
			System.out.print(a1 +"  "); // 10  20  30  40  100  50  200
		}
		System.out.println();
		
		Arrays.sort(a);
		
		System.out.println("after sorting");
		for(int a1:a){
			System.out.print(a1 +"  "); // 10  20  30  40  50  100  200
		}
		System.out.println();
		
		System.out.println("****************************************************");
		
		String[] s = {"a","z","b"};
		
		System.out.println("before sorting");
		for(String a1:s){
			System.out.print(a1 +"  "); // a z b 
		}
		System.out.println();
		
		Arrays.sort(s);
		
		System.out.println("after sorting");
		for(String a1:s){
			System.out.print(a1 +"  "); // a b z
		}
		System.out.println();
		
		Arrays.sort(s, new MyComparator());
		
		System.out.println("sorting after comparator");
		for(String a1:s){
			System.out.print(a1 +"  "); // z b a
		}
			
	}
}


class MyComparator implements Comparator{
	public int compare(Object obj1, Object obj2){
			String s1 = (String)obj1;
			String s2 = (String)obj2;
			
			return s2.compareTo(s1);
	}
}