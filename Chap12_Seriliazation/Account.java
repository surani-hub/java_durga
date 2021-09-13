import java.io.Serializable;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Account implements Serializable{
	String username = "Durga";
	transient String password = "Anushka";
	transient int pin = 1234;
	
	private void writeObject(ObjectOutputStream oos) throws Exception{
		oos.defaultWriteObject();
		String epwd = "123"+password;
		int epin = 555+pin;
		
		oos.writeObject(epwd);
		oos.writeInt(epin);
	}
	
	private void readObject(ObjectInputStream ois) throws Exception{
		ois.defaultReadObject();
		
		String epwd = (String)ois.readObject();
		int epin = ois.readInt();
		
		password = epwd.substring(3);
		pin = epin - 555;
	}
}