import java.util.ArrayList;
//import java.util.Integer;
import java.util.ListIterator;

class QuestionMarkDemo{
	public static void main(String[] args){
	
		ArrayList<String> l = new ArrayList<>();
		l.add("A");
		l.add("Z");
		l.add("M");
		l.add("H");
		l.add("Y");
		
		System.out.println(l);
		methodOne(l);
		System.out.println(l);
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(40);
		list.add(30);
		list.add(4);
		
		System.out.println(list);
		methodOne(list);
		System.out.println(list);
		
		methodTwo(l);
		System.out.println(l);
		
		methodThree(list);
		System.out.println(list);
		
	}
	
	public static void methodOne(ArrayList<?> m){
		m.add(null);
	}
	
	public static void methodTwo(ArrayList<? extends String> m){
		m.add(null);
	}
	
	public static void methodThree(ArrayList<? extends Number> m){
		m.add(null);
	}
}