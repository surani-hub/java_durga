class SynchronisedDemo{
	public static void main(String[] args){
		
		/*
		Display d = new Display();
		//Display d2 = new Display();
		MyDisplay t1 = new MyDisplay(d, "sudha");
		MyDisplay t2 = new MyDisplay(d, "raja");
		
		t1.start();
		t2.start();
		*/
		
		Display d = new Display();
		MyDisplay1 t1 = new MyDisplay1(d); // displayN
		MyDisplay2 t2 = new MyDisplay2(d); // displayC - one by one will execute
		
		MyDisplay3 t3 = new MyDisplay3(d,"Sudha"); // executes simultaneously
		MyDisplay4 t4 = new MyDisplay4(d); // executes simultaneously
		MyDisplay5 t5 = new MyDisplay5(d); // executes simultaneously
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
	}
}