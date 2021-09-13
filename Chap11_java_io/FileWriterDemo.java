import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.File;

class FileWriterDemo{
	public static void main(String[] args) throws IOException{
		
/*		
		FileWriter fw = new FileWriter("abc.txt", true);
		fw.write(100);
		fw.write("\n");
		fw.write("durga software\nsolutions");
		fw.write("\n");
		fw.write('a');
		fw.write("\n");
		char[] charArr = {'a','2','b'};
		fw.write(charArr);
		fw.flush();
		fw.close();
		
		
		FileReader fr = new FileReader("abc.txt");
		int i = fr.read();
		while(i != -1){
			System.out.print((char)i);
			i = fr.read();
		}
		*/
		
		File f = new File("abc.txt");
		char[] ch = new char[(int)f.length()];
		FileReader fr = new FileReader("abc.txt");
		fr.read(ch);
		for(char ch1 : ch){
			System.out.print(ch1);
		}
		
		
		
		
	}
}