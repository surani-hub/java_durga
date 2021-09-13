class Student{
	
	String name;
	int rollNo;
	
	Student(String name, int rollNo){
		this.name = name;
		this.rollNo = rollNo;
	}
	
	/*
	public String toString(){
		return name+" " + rollNo;
	}
	*/
	
	/*
	public boolean equals(Object o){
		if(this == o)
			return true;
		
		if(o instanceof Student){
			Student s = (Student)o;
			
			if(name.equals(s.name) && rollNo == s.rollNo)
				return true;
			else
				return false;
		}
		else
			return false;
	}
	*/

	public static void main(String[] main){
		/*
		Student s1 = new Student("sai", 10);
		Student s2 = new Student("Shravya", 20);
		Student s3 = new Student("sai", 10);
		Student s4 = s1;
		
		System.out.println(s1.equals(s2)); // false
		System.out.println(s1.equals(s3)); // false
		System.out.println(s1.equals(s4)); // true
		
		System.out.println(s1.equals("sai"));
		System.out.println(s1.equals(null));
		*/
		
		String str1 = new String("ashok");
		String str2 = new String("ashok");
		System.out.println("String class == : " + (str1 == str2)); // false
		System.out.println("String class equals() : " + str1.equals(str2)); // true
		
		StringBuffer sb1 = new StringBuffer("Rani");
		StringBuffer sb2 = new StringBuffer("Rani");
		System.out.println("StringBuffer class == : "+ (sb1 == sb2)); // false
		System.out.println("StringBuffer class equals() : "+sb1.equals(sb2)); // false
		
		/*
		Integer i = new Integer(10);
		String s = new String("Sudha");
		
		System.out.println(s1);
		System.out.println(s1.toString());
		System.out.println(s2);

		System.out.println(i);
		System.out.println(s);
		*/
	}
}