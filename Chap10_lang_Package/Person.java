class Person{
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public boolean equals(Object o){
		if(this == o)
			return true;
			
		if(o instanceof Person){
			Person p = (Person)o;
			
			if(name.equals(p.name) && age == p.age)
				return true;
			else
				return false;
		} else
			return false;
	}
	
	public int hashCode(){
		return name.hashCode() + age;
	}
	
	public static void main(String[] args){
		Person p1 = new Person("sudha", 120);
		Person p2 = new Person("Rani", 140);
		Integer i = new Integer(120);
		
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(i));
		
	}
}