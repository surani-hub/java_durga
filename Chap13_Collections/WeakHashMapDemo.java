import java.util.WeakHashMap;
import java.util.HashMap;

public class WeakHashMapDemo {
	public static void main(String[] args) throws InterruptedException{
		//WeakHashMap w = new WeakHashMap();
		HashMap w = new HashMap();
		Temp t = new Temp();
		w.put(t, "ashok");
		System.out.println(w);
		t=null;
		System.gc();
		Thread.sleep(2000);
		System.out.println(w);
	}
}

class Temp{
	public String toString(){
		return "Temp";
	}
	
	public void finalise(){
		System.out.println("finalise() method called");
	}
}