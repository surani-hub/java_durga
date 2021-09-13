import java.util.Arrays;
import java.util.Comparator;

class ArraysSearchDemo{
	public static void main(String[] args){
		int[] a = {10,5,20,11,6};
		Arrays.sort(a); // 5,6,10,11,20
		
		System.out.println(Arrays.binarySearch(a, 20)); // 4
		System.out.println(Arrays.binarySearch(a, 0)); // -1
		System.out.println(Arrays.binarySearch(a, 30)); // -6
		System.out.println(Arrays.binarySearch(a, 300)); // -6
		System.out.println(Arrays.binarySearch(a, 19)); // -5
		System.out.println("******************************************************************");
		
		String[] s = {"A","K","B","Y"};
		Arrays.sort(s); // A B K Y
		
		System.out.println(Arrays.binarySearch(s, "Z")); // -5
		System.out.println(Arrays.binarySearch(s, "S")); // -4
		System.out.println(Arrays.binarySearch(s, "C")); // -3
		System.out.println(Arrays.binarySearch(s, "K")); // 2
		System.out.println("******************************************************************");
		
		Arrays.sort(s, new MyComparator()); // Y K B A
		
		System.out.println(Arrays.binarySearch(s, "Z", new MyComparator())); // -1
		System.out.println(Arrays.binarySearch(s, "S", new MyComparator())); // -2
		System.out.println(Arrays.binarySearch(s, "C", new MyComparator())); // -3
		System.out.println(Arrays.binarySearch(s, "K", new MyComparator())); // 1
		
	}
}

class MyComparator implements Comparator{
	public int compare(Object obj1, Object obj2){
			String s1 = (String)obj1;
			String s2 = (String)obj2;
			
			return s2.compareTo(s1);
	}
}