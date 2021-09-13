class ThreadDemo{
	public static void main(String[] args) throws InterruptedException{
		
		MyThread thread = new MyThread();
		//thread.setPriority(10);
		thread.start();
		//thread.join();
		
		for(int i=0;i<10;i++){
			System.out.println("main thread");
			//System.out.println(Thread.currentThread().getName()+ " main method ");
			//System.out.println(Thread.currentThread().getPriority());
			//Thread.yield();
		}
		
		/*
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(thread.getPriority());
		thread.setPriority(8);
		System.out.println(thread.getPriority());
		Thread.currentThread().setPriority(7);
		MyThread thread1 = new MyThread();
		System.out.println(thread1.getPriority());
		*/
		
		//thread.start();
		//thread.run(10);
		//thread.run(10.98);
		
		//System.out.println("main thread");
		
		/*
		System.out.println(thread.getName());
		System.out.println(Thread.currentThread().getName()+ " main method ");
		
		Thread.currentThread().setName("sudha");
		System.out.println(Thread.currentThread().getName()+ " main method ");
		*/
		
		//thread.start();
		/*
		double mul = 0;
		for(int i = 1; i<=10;i++){
			 mul = i*2;
			 System.out.println("multiplication table of 2 is " + mul);
		}
		*/
	}
}