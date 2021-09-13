import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.util.regex.Pattern;
import java.util.regex.Matcher;


class ExtractMobileNumbers{
	public static void main(String[] args) throws IOException{
		
		PrintWriter pw = new PrintWriter("Output.txt");
		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
		
		String number = br.readLine();
		
		Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}");
		
		while(number != null){
			Matcher m = p.matcher(number);
			if(m.find()){
				pw.println(m.group());
			}
			number = br.readLine();
		}
		pw.flush();
	}
}