class Display{
	
	public synchronized void wish(String name){
		for(int i=0;i<10;i++){
		System.out.print("good morning ");
		try{
			Thread.sleep(2000);
		}catch(InterruptedException e){
			System.out.println("interrupted");
		}
		System.out.println(name);
		}
	}
	
	public static synchronized void displayN(){
		for(int i=1;i<=10;i++){
			System.out.print(i);
			try{
				Thread.sleep(2000); 
			 }catch(InterruptedException e){
				 
			 }
		 }
	 }
	 
	 public static synchronized void displayC(){
		 for(int i=65;i<=75;i++){
			 System.out.println((char)i);
			 try{
				 Thread.sleep(2000);
			 }catch(InterruptedException e){
				 
			 }
		 }
	 }
	 
	 public static void greet(){
		 for(int i=1;i<=10;i++){
			System.out.print("Greeting = " + i);
			try{
				Thread.sleep(2000); 
			 }catch(InterruptedException e){
				 
			 }
		 }
		 
	 }
	 
	 public void sayGoodBye(){
		 for(int i=1;i<=10;i++){
			System.out.print("goodbye = " + i);
			try{
				Thread.sleep(2000); 
			 }catch(InterruptedException e){
				 
			 }
		 }
	 }
}