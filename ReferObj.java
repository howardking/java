import java.util.*;

class FloatTest{
	public float f = 0;
	public void ff(float f){
		this.f = f;
	}
}

public class ReferObj{
	public static void main(String[] args){
		FloatTest test1 = new FloatTest();
		FloatTest test2 = new FloatTest();

		System.out.println(test1.f);
		test1.ff(10.0f);
		System.out.println(test1.f);
		System.out.println(test2.f);
		test2 = test1;
		test2.ff(10000.0f);
		System.out.println(test1.f);
		System.out.println(test2.f);
	}
} 
