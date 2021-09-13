public enum Sudha implements Unknown{
	
	LIFE, CAREER, TRAVEL,BUSINESS;
	
	Sudha(){
		System.out.println("Constructor");
	}
	
	public void happyMethod(){
		System.out.println("Being happy");
	}
	
	public void achieveThings(){
		System.out.println("Achieveing the things which are impossible for others");
	}
	
	public static void main(String[] args){
		/*
		Sudha s = Sudha.LIFE;
		s.happyMethod();
		
		Sudha s1 = Sudha.CAREER;
		s1.achieveThings();
		*/
		
		Sudha[] toDos = Sudha.values();
		
		for(Sudha d:toDos){
				System.out.println(d+"  "+d.ordinal() +"  ");
				//d.happyMethod();
		}
		
	}
}