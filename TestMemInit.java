import java.util.*;

public class TestMemInit{
	int i;
	void increment(){
		System.out.println(i);
		i++;
		System.out.println(i);
	}
	public static void main(String[] args){
		int j = 10;	
		TestMemInit init = new TestMemInit();
		init.increment();
		System.out.println("Test member initialize  " + j);
	}
}
