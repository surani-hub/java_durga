class ShallowCloning{
	public static void main(String[] args) throws CloneNotSupportedException{
		Cat c = new Cat(10);
		Dog d = new Dog(c, 20);
		
		System.out.println(d.c.i + "  " + d.j); // 10 20
		
		Dog d2 = (Dog)d.clone();
		System.out.println(d2.c.i + "  " + d2.j); // 10 20
		
		d2.c.i = 100;
		d2.j = 200;
		System.out.println("After cloning: " + d.c.i+"  " + d.j); // 100 20
		System.out.println("After cloning: " + d2.c.i+"  " + d2.j); // 100 200
		
		/*
		d2.c.i = 100;
		d2.j = 200;
		System.out.println("After cloning: " + d.c.i + "  " + d.j); // 10 20
		System.out.println("After cloning: " + d2.c.i + "  " + d2.j); // 100 200
		*/
		
		System.out.println(c.getClass());
		System.out.println(d.getClass());
		System.out.println(d2.getClass());
		
	}
}



