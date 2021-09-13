class MyThread extends Thread{
	/*
	public void start(){
		super.start();
		System.out.println("start method");
	}
	
	String name;
	MyThread(String name){
		this.name = name;
	}
	*/
	static Thread mainThread;
	
	public void run(){
		for(int i=0;i<10;i++){
		System.out.println("run method");
		try{
			Thread.sleep(2000);
		} catch(InterruptedException e){
			System.out.println("caught");
		}
		//System.out.println(Thread.currentThread().getName() + " run method");
		//System.out.println(Thread.currentThread().getPriority());
		//Thread.yield();
		}
	}
	/*
	public void run(){
	double sum = 0;
		for(int i =1; i<=100; i++){
			sum = sum + i;
			//System.out.println("sum of 100 numbers is = "+ sum);
		}
		System.out.println("sum of 100 numbers is = "+ sum);
		
		
		System.out.println("no-arg run method of thread class");
	} 
	
	public void run(int i){
		System.out.println("int-arg method");
	}
	
	public void run(double i){
		System.out.println("double-arg method");
	}
	*/
} 
