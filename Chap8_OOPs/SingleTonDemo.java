class SingleTonDemo{
	private static SingleTonDemo d = new SingleTonDemo();
	
	private SingleTonDemo(){
	
	}
	
	public static SingleTonDemo getSingleObject(){
		return d;
	}
}