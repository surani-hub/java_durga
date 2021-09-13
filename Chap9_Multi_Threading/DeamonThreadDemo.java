class DeamonThreadDemo{
	public static void main(String[] args){
		System.out.println(Thread.currentThread().isDaemon());
		
		//Thread.currentThread().setDaemon(true);
		
		ThreadOne one = new ThreadOne();
		System.out.println(one.isDaemon());
		//one.setDaemon(true);
		System.out.println(one.isDaemon());
		one.start();
		System.out.println("main thread");
		
	}
}

