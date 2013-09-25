import java.util.*;

class Dog{
	private String name;
	private String words;

	Dog(String name, String words){
		this.name = name;
		this.words = words;
	}

	public String SayName(){
		return this.name;
	}

	public String SayWords(){
		return this.words;
	}
}

public class TestEquals{
	public static void main(String[] args){
		Dog dog1 = new Dog("hello","world");
		Dog dog2 = new Dog("hello","world");

		System.out.println(dog1 == dog2);
		System.out.println(dog1.equals(dog2));
		
	}
}
