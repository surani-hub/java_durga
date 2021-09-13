import java.util.regex.Pattern;
import java.util.regex.Matcher;

import java.io.File;

class DisplayTextFiles{
	public static void main(String[] args){
		 
		 int count = 0;
		 
		Pattern p = Pattern.compile("[a-zA-Z0-9_$.]+[.]txt");
		
		File f = new File("D:\\JAVA\\JavaByDurga\\Chap19_Regular_Expression");
		
		String[] files = f.list();
		
		for(String name: files){
			Matcher m = p.matcher(name);
			
			if(m.find()&&m.group().equals(name)){
				count++;
				System.out.println(name);
			}
		}
		System.out.println(count);
	}
}