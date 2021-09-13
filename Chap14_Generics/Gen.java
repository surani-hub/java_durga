class Gen<T>{
	T obj;
	
	Gen(T obj){
		this.obj = obj;
	}
	
	public void show(){
		System.out.println("object is "+ obj.getClass().getName());
	}
	
	public T getObject(){
		return obj;
	}
}