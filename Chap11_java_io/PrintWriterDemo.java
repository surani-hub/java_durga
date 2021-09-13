import java.io.PrintWriter;
import java.io.IOException;

class PrintWriterDemo{
	public static void main(String[] args) throws IOException{
		
		PrintWriter pw = new PrintWriter("abc.txt");
		pw.write(1100);
		pw.println('d');
		pw.println("sudha");
		pw.println(12.34);
		pw.println('c');
		pw.println(true);
		
		pw.flush();
		pw.close();
	}
}