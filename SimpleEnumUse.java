import java.util.*;

enum Spiciness{
	NOT, MILD, MEDIUM, HOT, FLAMING
}

public class SimpleEnumUse{
	public static void main(String[] args){
		Spiciness spi = Spiciness.FLAMING;
		System.out.println(spi);
	}
}
