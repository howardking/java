import java.util.*;

class Dog2{
	Dog2(int age){
		System.out.println("I am " + age + " year(s) old");
	}
}

public class TestOverloading{
	public static void main(String[] args){
//		Dog2 dog1 = new Dog2();//does not work
		Dog2 dog2 = new Dog2(9);//Ok, it works
	}
}
