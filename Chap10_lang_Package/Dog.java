class Dog implements Cloneable{
	int j;
	Cat c;
	
	Dog(Cat c, int j){
		this.c = c;
		this.j = j;
	}
	
	public Object clone() throws CloneNotSupportedException{
		//return super.clone();
		Cat c1 = new Cat(c.i);
		Dog d1 = new Dog(c1, this.j);
		return d1;
	}
}