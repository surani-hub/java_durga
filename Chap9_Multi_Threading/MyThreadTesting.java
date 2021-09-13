class MyThreadTesting extends Thread{
	static Thread mainThread;
	
	public void run(){
	try{
		mainThread.join();
	}catch(InterruptedException e){
		System.out.println("caught");
	}
	
	for(int i=0;i<10;i++){
		System.out.println("child thread");
	}
	}
}