import java.util.*;

class Domin{
	public void main(String[] args){
		for (String arg:args){
			System.out.println(arg);
		}
	}
}

public class TestArrayInit{
	public static void main(String[] args){
		Domin domin = new Domin();
		domin.main(new String[]{"hello","world","!"});
//		domin.main("hello","world","!");//此处必须创建对象，否则会出错
	}
}
