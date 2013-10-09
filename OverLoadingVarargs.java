import java.util.*;

public class OverLoadingVarargs{
	static void f(int i, Character... arg){
		System.out.println("First");
	}
	static void f(char c, Character... arg){
		System.out.println("Second");
	}

	public static void main(String[] args){
		f(1, 'a');
		f('b','c');
	}
} 
