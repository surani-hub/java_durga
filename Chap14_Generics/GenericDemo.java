class GenericDemo{
	public static void main(String[] args){
		Gen<String> str = new Gen<>("sudha");
		str.show();
		System.out.println(str.getObject());
		
		Gen<Integer> inte = new Gen<Integer>(10);
		inte.show();
		System.out.println(inte.getObject());
	}
}