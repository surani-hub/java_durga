import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;

class SerializationWithInheritance{
	public static void main(String[] args) throws Exception{
		Child c1 = new Child();
		
		System.out.println(c1.parentVar+"   "+c1.childVar);
		
		FileOutputStream out = new FileOutputStream("abc.ser");
		ObjectOutputStream stream = new ObjectOutputStream(out);
		stream.writeObject(c1);
		
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Child c2 = (Child)ois.readObject();
		
		System.out.println(c2.parentVar+"   "+c2.childVar);
	}
}