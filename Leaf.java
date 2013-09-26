import java.util.*;

public class Leaf{
	int i = 0;
	Leaf increment(){
		i++;
		return this;
	}
	
	void printLeaf(){
		System.out.println("i = " + i);
	}	

	public static void main(String[] args){
		Leaf leaf = new Leaf();
		leaf.increment().increment().increment().increment().printLeaf();
	}
}
