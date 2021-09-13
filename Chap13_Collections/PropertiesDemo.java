import java.util.Properties;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.util.Enumeration;

class PropertiesDemo{
	public static void main(String[] args) throws IOException{
		
		Properties p = new Properties();
		
		FileInputStream fis = new FileInputStream("abc.properties");
		
		p.load(fis);
		
		System.out.println(p);
		
		String s = p.getProperty("user");
		System.out.println(s);
		
		p.setProperty("nag", "9999");
		System.out.println(p);
		
		Enumeration e = p.propertyNames();
		while(e.hasMoreElements()){
			String s1= (String)e.nextElement();
			System.out.println(s1);
		}
		
		FileOutput8Stream fos = new FileOutputStream("abc.properties");
		p.store(fos,"updated by sudha");
	}
}	