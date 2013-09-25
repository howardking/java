import java.util.*;

public class TestLable{
	public static void main(String[] args){
		int i = 0;
		outer:
		for (int j = 0; j<10; j++){
			inner:
			for (;;){
				if (2==i++){
					System.out.println("i= " + i);
					continue outer;
				}
				if (4==i){
					System.out.println("i= " + i);
					break outer;
				}
			System.out.println("i= " + i);
			}

		}
		System.out.println("This is the end of the test");
	}
} 
