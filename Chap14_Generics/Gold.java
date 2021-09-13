class Gold{
	double goldPrice;
	int quantity;
	
	Gold(double goldPrice, int quantity){
		this.goldPrice = goldPrice;
		this.quantity = quantity;
	}
	
	public String toString(){
		return "For " + quantity + "gram/kg, the price would be "+ goldPrice;
	}
}