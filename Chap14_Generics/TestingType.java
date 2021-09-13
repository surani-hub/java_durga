import javax.swing.*;
import java.util.concurrent.*;

/*class Test<T>{

}

class Test<T extends Number>{

}


class Test<T extends Runnable>{

}


class Test<T extends Number & Runnable>{

}

class Test<T extends Number & String>{

}

class Test<T extends Number & Comparable>{

}
*/
class Test<T extends Number & Runnable & Comparable>{

}

public class TestingType{
	public static void main(String[] args){
		/*
		Test<Thread> i1 = new Test<>();
		Test<SwingWorker> i2 = new Test<>();
		Test<FutureTask> i3 = new Test<>();
		
		//Test<Integer> i2 = new Test<>();
		
		
		Test<Integer> i1 = new Test<>();
		Test<Double> i3 = new Test<>();
		Test<Number> i2 = new Test<>(); */
		//Test<Object> i4 = new Test<>();
		//Test<String> i2 = new Test<>();
		
	}
}