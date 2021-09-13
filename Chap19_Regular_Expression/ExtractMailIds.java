import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.util.regex.Pattern;
import java.util.regex.Matcher;


class ExtractMailIds{
	public static void main(String[] args) throws IOException{
		
		PrintWriter pw = new PrintWriter("emailOutput.txt");
		BufferedReader br = new BufferedReader(new FileReader("emailInput.txt"));
		
		String number = br.readLine();

		Pattern p = Pattern.compile("[a-zA-Z]+[a-zA-Z0-9._]*@[a-zA-Z]+([.][a-zA-Z]+)+");
		
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