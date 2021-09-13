import java.util.ArrayList;

class GenericMethod{
	public static void main(String[] args){
		ArrayList l = new ArrayList();
		l.add("sudha");
		l.add("rani");
		l.add("Great job!");
		l.add(10);
		l.add(true);
		
		//System.out.println(l);
		System.out.println();
		/*
		methodOne(l);
		System.out.println(l);
		System.out.println();
		
		methodTwo(l);
		System.out.println(l);
		System.out.println();
		
		methodThree(l);
		System.out.println(l);
		System.out.println();
		*/
		methodFour(l);
		System.out.println(l);
		System.out.println();
		
		methodFive(l);
		System.out.println(l);
		System.out.println();
		
	}
	/*
	public static void methodOne(ArrayList<String> l){
		l.add("sudha");
		l.add("rani");
		l.add("Great job!");		
	}
	
	public static void methodTwo(ArrayList l){
		l.add("sudha");
		l.add("rani");
		l.add("Great job!");
		l.add(10);
		l.add(true);
	}
	
	public static void methodThree(ArrayList<?> l){
		l.add(null);
	}
	*/
	public static <String extends Number> void methodFour(ArrayList<? extends Number> l){
		//l.add(10.82);
		//l.add(100);
		l.add(null);
		//l.add("Excellent!");
	//	l.add(100);
	}
	
	public static void methodFive(ArrayList<? extends Runnable> l){
	//	l.add(new Thread());
	//	l.add(new Runnable());
	//	l.add(new String());	
		l.add(null);
	}
	
}