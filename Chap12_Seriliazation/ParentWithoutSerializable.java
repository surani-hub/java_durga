import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class ParentWithoutSerializable{
	public static void main(String[] args) throws Exception{
	
		DogAnimal dog = new DogAnimal();
		dog.dogAge = 200;
		dog.name = "German shepherd";
		
		System.out.println(dog.dogAge+"   "+dog.name); // 200, German shepherd
		
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(dog);
		
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		DogAnimal d2 = (DogAnimal)ois.readObject();
		
		System.out.println(d2.dogAge+"   "+d2.name); // 20, parent constructor execution and then default value, Penguin
	}
}