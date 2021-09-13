class MyDisplay1 extends Thread{
	Display d;
	
	MyDisplay1(Display d){
		this.d = d;
	}
	
	public void run(){
		d.displayN();
	}
}