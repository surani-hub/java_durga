import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexForMobileNumbers{
	public static void main(String[] args){
		
		//Pattern p = Pattern.compile("[7-9][0-9]{9}");
		//Pattern p = Pattern.compile("0?[7-9][0-9]{9}");
		Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}");
		Matcher m = p.matcher(args[0]);
		
		if(m.find()&&m.group().equals(args[0])){
			System.out.println("it's valid number");
		} else {
			System.out.println("it's invalid number");
		}
	}
}