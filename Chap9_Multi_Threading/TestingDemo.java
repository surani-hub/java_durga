class TestingDemo{
	public static void main(String[] args) throws InterruptedException{
		MyThreadTesting.mainThread = Thread.currentThread();
		
		MyThreadTesting thread = new MyThreadTesting();
		thread.start();
		
		for(int i=0;i<10;i++){
			System.out.println("main thread");
			Thread.sleep(2000, 100);
		}
	}
}