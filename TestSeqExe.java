import java.util.*;

class Window{
	Window(int maker){
		System.out.println("Window ( " + maker + " )");
	}
}

class House{
	Window win1 = new Window(1);
	House(){
		System.out.println("House");
		win3 = new Window(33);
	}		
	Window win2 = new Window(2);
	void f(){
		System.out.println("f()");
	}
	Window win3 = new Window(3);
}

public class TestSeqExe{
	public static void main(String[] args){
	System.out.println("Now in main()");
	//	House house = new House();
	//	house.f();
	}
}
