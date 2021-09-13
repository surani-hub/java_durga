class ConstructorDemo{
	String name;
	int rollno;
	
	ConstructorDemo(String name, int rollno){
		this.name = name;
		this.rollno = rollno;
	}
	
	public static void main(String[] args){
		ConstructorDemo d1 = new ConstructorDemo("durga", 1010);
		ConstructorDemo d2 = new ConstructorDemo("softie", 2020);
		
		System.out.println(d1);
		System.out.println(d2);
	}
	
	public String toString(){
		return name+" "+rollno;
	}
}