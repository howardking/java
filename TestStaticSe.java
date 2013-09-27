import java.util.*;


public class TestStaticSe{
	public static void main(String[] args){
		System.out.println("main method");
		TestStaticSe.print();
	}	
	static {
		System.out.println("Static out of the class");
	}
	static void print(){
		System.out.println("This is a static method which defined after the main method");
	}
} 
