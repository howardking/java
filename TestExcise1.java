import java.util.Random;

public class TestExcise1
{
	public static void main(String[] args){
		int[] count = new int[41];
		int n = 0;
		Random random = new Random();
		
	
		for (int i=0; i<50; i++){
			n = random.nextInt(41);
			count[n]++;
		}

		for (int i=0; i<count.length; i++){
			if(count[i] !=0 ){
				System.out.println(i+10 + " " + count[i]);
			}
		}
	}
}
