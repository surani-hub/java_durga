import java.util.regex.Pattern;
import java.util.regex.Matcher;

class MatchingRegexDemo{
	public static void main(String[] args){
		
		//Pattern p = Pattern.compile("ab");
		//Pattern p = Pattern.compile("a");
		//Pattern p = Pattern.compile("a+");
		//Pattern p = Pattern.compile("a*");
		Pattern p = Pattern.compile("a?");
		
		Matcher m = p.matcher("abbaaababbaaba");
		
		while(m.find()){
			System.out.println(m.start()+"----"+m.group());
		}
		
	}
}