import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Externalizable;
import java.io.IOException;


class ExternalizableDemo implements Externalizable{
	String s;
	int i;
	int j;
	
	public ExternalizableDemo(){
		System.out.println("public no-arg constructor");
	}
	
	ExternalizableDemo(String s, int i, int j){
		this.s = s;
		this.i = i;
		this.j = j;
	}
	
	public void writeExternal(ObjectOutput out) throws IOException{
		out.writeObject(s);
		out.writeInt(i);
	}
	
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException{
		s = (String)in.readObject();
		i = in.readInt();
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		ExternalizableDemo e1 = new ExternalizableDemo("durga", 10,20);
		
		System.out.println(e1.s+"   "+e1.i+"   "+e1.j);
		
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e1);
		
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ExternalizableDemo e2 = (ExternalizableDemo)ois.readObject();
		 
		System.out.println(e2.s+"   "+e2.i+"   "+e2.j);
	}
}