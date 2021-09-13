class Popcorn{
	public void taste(){
		System.out.println("spicy");
	}
}

public class TestPopcorn{
	public static void main(String[] args){
		Popcorn namelessObj = new Popcorn(){
									public void taste(){
										m1();
										System.out.println("anonymously salty");
									}
									
									public void m1(){
										System.out.println("anonymous inner method");
									}
								};
		
		Popcorn cornObj = new Popcorn();
		cornObj.taste(); // spicy
		namelessObj.taste(); // anonymously salty
		
		//namelessObj.m1();  // unable to call m1 outside anonymous inner class
		
	}
}