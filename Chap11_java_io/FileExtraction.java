import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.File;
import java.io.FileReader;

class FileExtraction{
	public static void main(String[] args) throws IOException{
	
	PrintWriter pw = new PrintWriter("fileExtracted.txt");
	BufferedReader br1 = new BufferedReader(new FileReader("input.txt"));
	String target = br1.readLine();
	
		while(target != null){
			boolean available = false;
			BufferedReader br2 = new BufferedReader(new FileReader("delete.txt"));
			String input = br2.readLine();
			
			while(input != null){
				if(target.equals(input)){
				available = true;
				break;
				}
				input = br2.readLine();
			}
			
			if(available == false){
				pw.println(target);
			}
			
			target = br1.readLine();
		}
		pw.flush();
	}
}