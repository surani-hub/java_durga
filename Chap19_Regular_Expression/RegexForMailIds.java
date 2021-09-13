import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexForMailIds{
	public static void main(String[] args){
		
		//Pattern p = Pattern.compile("[7-9][0-9]{9}");
		Pattern p = Pattern.compile("[a-zA-Z0-9]+[a-zA-Z0-9_.]*@gmail[.]com");
		//Pattern p = Pattern.compile("[a-zA-Z]+[a-zA-Z0-9._]*@[a-zA-Z]+([.][a-zA-Z]+)+");
		
		Matcher m = p.matcher(args[0]);
		
		if(m.find()&&m.group().equals(args[0])){
			System.out.println("it's valid mail id");
		} else {
			System.out.println("it's invalid mail id");
		}
	}
}