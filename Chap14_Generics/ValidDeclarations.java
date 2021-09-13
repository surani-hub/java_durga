import java.util.ArrayList;

class ValidDeclarations{
	public static void main(String[] args){
		
		//ArrayList<?> l = new ArrayList<String>();
		
		//ArrayList<? extends Number> l = new ArrayList<Number>();
		//ArrayList<? extends Number> l = new ArrayList<Integer>();
		//ArrayList<? extends Number> l = new ArrayList<Object>(); - Number's parent is not possible
		
		//ArrayList<?> l = new ArrayList<? extends Number>();
		
		ArrayList<?> l = new ArrayList<Runnable>();
		
		l.add(null);
		
		
	}
}