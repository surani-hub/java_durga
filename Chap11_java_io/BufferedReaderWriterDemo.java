import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

class BufferedReaderWriterDemo{
	public static void main(String[] args) throws IOException{
		
		/*
		FileWriter fw = new FileWriter("abc.txt");
		BufferedWriter br  = new BufferedWriter(fw);
		br.write(100);
		br.newLine();
		br.write("durga software");
		br.newLine();
		br.write('a');
		br.newLine();
		char[] ch = {'a','2','b'};
		br.write(ch);
		br.flush();
		br.close();                
		*/
		
		FileReader fr = new FileReader("abc.txt");
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		while(line != null){
			System.out.println(line);
			line = br.readLine();
		}
		br.close();
	}
}