class AssertInsidePrivate{
	private void stuff(int y){
		assert(y<0);
	}
	
	public static void main(String[] args){
		AssertInsidePrivate a = new AssertInsidePrivate();
		a.stuff(10);
	}
}