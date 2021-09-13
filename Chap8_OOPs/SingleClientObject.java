class SingleClientObject{
	public static void main(String[] args){
		SingleTonDemo singleObj = SingleTonDemo.getSingleObject();
		SingleTonDemo singleObj2 = SingleTonDemo.getSingleObject();
		SingleTonDemo singleObj3 = SingleTonDemo.getSingleObject();
		
		System.out.println(singleObj.hashCode());
		System.out.println(singleObj2.hashCode());
		System.out.println(singleObj3.hashCode());
		
		System.out.println(singleObj == singleObj2);
		System.out.println(singleObj == singleObj3);
		System.out.println(singleObj2 == singleObj3);
		
	}
}