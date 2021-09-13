public final class CreateImmutability{
	
	private int i;
	
	CreateImmutability(int i){
		this.i = i;
	}
	
	public CreateImmutability modify(int i){
		if(this.i == i)
			return this;
		else
			return (new CreateImmutability(i));
	}
	
	public static void main(String[] args){
	
		CreateImmutability c1 = new CreateImmutability(10);
		CreateImmutability c2 = c1.modify(100);
		CreateImmutability c3 = c1.modify(10);
		
		System.out.println(c1==c2); // false
		System.out.println(c1==c3); // true
		
		CreateImmutability c4 = c1.modify(100);
		
		System.out.println(c1 == c4); // false
		
	}
}