import java.util.ArrayList;

class TestingQuestionMark{
	public static void main(String[] args){
		ArrayList l = new ArrayList();
		l.add("sudha");
		l.add("rani");
		l.add("Great job!");
		l.add(10);
		l.add(true);
		
		System.out.println(l);
		System.out.println();
		
		methodFour(l);
		System.out.println(l);
		System.out.println();
		
		methodFive(l);
		System.out.println(l);
		System.out.println();
		
	}
	
	
	public static void methodFour(ArrayList<? super Integer> l){
		l.add(100);
		l.add(null);
		l.add(new Integer(20));
	}
	
	public static void methodFive(ArrayList<? super String> l){
		l.add(new String());	
		l.add(null);
		l.add("SUDHUUUU");
	}
	
}
		/*
		ArrayList<?> l = new ArrayList();
		l.add(null);
		
		System.out.println(l);
		System.out.println();
		
		methodFour(l);
		System.out.println(l);
		System.out.println();
		
		methodFive(l);
		System.out.println(l);
		System.out.println();
	}
	
	public static void methodFour(ArrayList<? extends Number> l){
		//l.add(10.82);
		//l.add(100);
		l.add(null);
	//	l.add(100);
	}
	
	public static void methodFive(ArrayList<? extends Runnable> l){
	//	l.add(new Thread());
	//	l.add(new Runnable());
	//	l.add(new String());	
		l.add(null);
	}	
}
*/

