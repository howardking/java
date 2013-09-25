import java.util.*;

public class TestBreakContinue{
	public static void main(String[]args){
		for (int i=0; i<10; i++){
			int j = 10;
			while (5!=j){
				if (10==j){
					System.out.println(j);
				}
				j--;
			}
		}
	}
}
