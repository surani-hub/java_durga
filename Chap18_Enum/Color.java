enum Color{
	RED{
		public void info(){
		System.out.println("most loved color");
	}
	}, BLUE {
		public void info(){
		System.out.println("my favorite color");
	}
	}, GREEN;
	
	public void info(){
		System.out.println("universal colors");
	}
}