class MyDisplay5 extends Thread{
	Display d;
	
	MyDisplay5(Display d){
		this.d = d;
	}
	
	public void run(){
		d.sayGoodBye();
	}
}