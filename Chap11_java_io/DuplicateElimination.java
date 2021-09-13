import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.File;
import java.io.FileReader;


class DuplicateElimination{
	public static void main(String[] args) throws IOException{
		
		PrintWriter pw = new PrintWriter("duplicateRemoved.txt");
		BufferedReader input = new BufferedReader(new FileReader("GivenFile.txt"));
		String line = input.readLine();
		
		while(line != null){
			boolean available = false;
			BufferedReader target = new BufferedReader(new FileReader("duplicateRemoved.txt"));
			String targetLine = target.readLine();
			
			while(targetLine != null){
				if(line.equals(targetLine)){
					available = true;
					break;
				}
				targetLine = target.readLine();
			}
			
			if(available == false){
				pw.println(line);
				pw.flush();
			}
			line = input.readLine();
		}
	}
}
