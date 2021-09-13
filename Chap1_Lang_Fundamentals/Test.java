class Test{
	public static void methodOne(int[]... i){
		for(int[] a:i){
			System.out.println(a[0]);
			
		}
	}
	
	public static void main(String[] args){
		int[] l = {10,20,30};
		int[] m = {40,50};
		
		methodOne(l,m);
	}
	
}