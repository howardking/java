import java.util.Random;

public class TestRandomExe
{
	public static void main(String[] args){
		Random random = new Random();
		
		for (int i=0; i<50; i++){
			System.out.println(random.nextInt(41) + 10);
		}
	}
}
