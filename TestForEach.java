import java.util.*;

public class TestForEach{
	public static void main(String[] args){
		Random rand = new Random();
		float [] f = new float[10];
		for (int i=0; i<10; i++){
			f[i] = rand.nextInt(100);
		}
		for (float x : f){
			System.out.println(x);
		}
	}
}
