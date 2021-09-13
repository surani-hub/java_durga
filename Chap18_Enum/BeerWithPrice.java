enum BeerWithPrice{
	KF(100), KO(40), RC(20), KALYANI;
	
	double price;
	
	BeerWithPrice(){
		this.price = 125;
	}
	
	BeerWithPrice(double price){
		this.price = price;
	}
	
	public double getPrice(){
		return price;
	}
	
	
}