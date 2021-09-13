import java.io.Serializable;

class DogAnimal extends Animal implements Serializable{
	int dogAge = 20;
	
	DogAnimal(){
		System.out.println("Trustful animals");
	}
}