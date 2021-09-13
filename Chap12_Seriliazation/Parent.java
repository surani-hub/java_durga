import java.io.Serializable;

class Parent implements Serializable{
	transient int parentVar = 10;
}