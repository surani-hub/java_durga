import java.util.Stack;

class StackDemo{
	public static void main(String[] args){
		Stack s = new Stack();
		s.push("sudha");
		s.push("raja");
		s.push("chinni");
		s.push("paaki");
		s.push("pinki");
		
		System.out.println(s);
		
		System.out.println(s.peek());
		
		System.out.println("*********************************");
		
		while(s.empty() == false){
			System.out.println(s.pop());
		}
		
		System.out.println(s);
		
	}
}