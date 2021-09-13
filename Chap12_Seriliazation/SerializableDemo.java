import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
//import java.io.Exception;


class SerializableDemo{
	public static void main(String[] args) throws Exception{
		Dog d1 = new Dog();
		
		//System.out.println(d1.i +"   "+ d1.j);
		
		FileOutputStream out = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(out);
		oos.writeObject(d1);
		
		FileInputStream in = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(in);
		Dog d2 = (Dog)ois.readObject();
		
		//System.out.println(d2.i +"   "+ d2.j);
		System.out.println(d2.c.r.j);
	}
}