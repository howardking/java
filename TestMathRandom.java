public class TestMathRandom
{
	public static void main(String[] args){
		
		for (int i=0; i<50; i++){
			double result = Math.random();
			result *= 41;
			int result2 = (int)result;
			result2 += 10;
			System.out.println(result2);
		}
	}
}
