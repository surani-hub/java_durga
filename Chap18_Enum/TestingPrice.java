public class TestingPrice{
	public static void main(String[] args){
		BeerWithPrice[] bwp = BeerWithPrice.values();
		
		for(BeerWithPrice b : bwp){
			System.out.println(b +"  "+ b.getPrice());
		}
		
	System.out.println(BeerWithPrice.KF == BeerWithPrice.RC);
	System.out.println(BeerWithPrice.KF.equals(BeerWithPrice.RC));
	
	}
}