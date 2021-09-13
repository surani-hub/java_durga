class ChildMethod extends Thread{
	public void run(){
		try{
		for(int i=0;i<10;i++){
			System.out.println("child thread");
			//Thread.sleep(3000);
			}
		}catch(InterruptedException e){
			System.out.println("I got interrupted");
		}
	}
}