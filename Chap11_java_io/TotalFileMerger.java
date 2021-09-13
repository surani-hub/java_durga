import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.File;
import java.io.FileReader;

class TotalFileMerger{
	public static void main(String[] args) throws IOException{
		
		PrintWriter pw = new PrintWriter("Output.txt");
		File files = new File("D:\\JAVA\\JavaByDurga\\Chap11_java_io");
		String[] fileList = files.list();
		
		for(String s1:fileList){
			//if(s1.isFile()){
			//}
			
			if(s1.endsWith(".txt")){
				BufferedReader br = new BufferedReader(new FileReader(new File(files, s1)));
				String line = br.readLine();
			
				while(line != null){
					pw.println(line);
					line = br.readLine();
				}
			}
			
		}
		pw.flush();
	}
}