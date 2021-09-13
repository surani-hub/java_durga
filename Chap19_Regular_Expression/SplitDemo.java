import java.util.regex.Pattern;

class SplitDemo{
	public static void main(String[] args){
		
		Pattern p = Pattern.compile("\\s");
		String[] str = p.split("sudha, I really respect and appreciate your journey towards luxurious life");
		
		for(String msg : str){
			System.out.println(msg);
		}
		
		System.out.println("*******************************************");
		
		p = Pattern.compile("\\.");
		str = p.split("www.gmail.com");
		
		for(String msg1 : str){
			System.out.println(msg1);
		}
	}
}