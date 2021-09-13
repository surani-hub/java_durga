import java.util.List;
import java.util.Arrays;


class ArraysAsListDemo{
	public static void main(String[] args){
		String[] s = {"A","Z","O","K"};
		List l = Arrays.asList(s);
		
		for(String str:s){
			System.out.print(str +" ");
		}
		System.out.println();
		System.out.println(l);
		
		l.set(1,"Sudha");
		for(String str:s){
			System.out.print(str +" ");
		}
		
		s[3] = "Rani";
		System.out.println();
		System.out.println(l);
		
		///l.add(ashok);
		
	}
}