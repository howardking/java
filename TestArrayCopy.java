import java.util.Arrays;

public class TestArrayCopy
{
	public static void main(String[] args){
		int[] luckyNumber = new int[10];
		for (int i=0; i<luckyNumber.length; i++){
			luckyNumber[i] = i;
		}
		luckyNumber = Arrays.copyOf(luckyNumber, 2 * luckyNumber.length);
		Arrays.sort(luckyNumber);
		for (int x : luckyNumber){
			System.out.println(x);
		}
	}
}
