import java.util.regex.Pattern;
import java.util.regex.Matcher;

class DifferentRegexDemo{
	public static void main(String[] args){
		
		//Pattern p = Pattern.compile("[abc]");
		//Pattern p = Pattern.compile("[^abc]");
		//Pattern p = Pattern.compile("[0-9]");
		//Pattern p = Pattern.compile("[a-z]");
		//Pattern p = Pattern.compile("[^a-zA-Z0-9]");
		
		//Pattern p = Pattern.compile("\\s");
		//Pattern p = Pattern.compile("\\d");
		//Pattern p = Pattern.compile("\\w");
		//Pattern p = Pattern.compile(".");
		
		//Pattern p = Pattern.compile("\\S");
		//Pattern p = Pattern.compile("\\D");
		Pattern p = Pattern.compile("\\W");
		
		
		//Matcher m = p.matcher("a1b7@z#");
		Matcher m = p.matcher("a1b7 @z#");
		
		while(m.find()){
			System.out.println(m.start()+"----"+m.group());
		}
		
	}
}