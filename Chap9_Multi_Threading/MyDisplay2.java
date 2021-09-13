class MyDisplay2 extends Thread{
	Display d;
	
	MyDisplay2(Display d){
		this.d = d;
	}
	
	public void run(){
		d.displayC();
	}
}