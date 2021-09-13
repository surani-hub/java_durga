class MyDisplay extends Thread{
	Display d;
	String name;
	
	MyDisplay(Display d, String name){
		this.d = d;
		this.name = name;
	}
	
	public void run(){
		d.wish(name);
	}
}