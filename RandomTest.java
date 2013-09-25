import java.util.*;

public class RandomTest{
	public static void main(String[] args){
		Random rand = new Random(100);
		Random randTime = new Random();
		int j = 5;
		int i = rand.nextInt(100);
		while (--j>0){
			System.out.println(i);
			i = rand.nextInt(100);
		}
		
		j = 5;
		i = randTime.nextInt(100);
		while(--j>0){
			System.out.println(i);
			i = randTime.nextInt(100);
		}
		
	}
}
