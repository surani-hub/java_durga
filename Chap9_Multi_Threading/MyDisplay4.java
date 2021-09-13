class MyDisplay4 extends Thread{
	Display d;
	
	MyDisplay4(Display d){
		this.d = d;
	}
	
	public void run(){
		d.greet();
	}
}