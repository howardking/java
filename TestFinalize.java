import java.util.*;

class Book{
	boolean checkout = false;
	Book(boolean checkout){
		this.checkout = checkout;
	}
	void checkin(){
		checkout = false;
	}

	protected void finalize(){
		if (checkout){
			System.out.println("Error:checked out");
		}else{
			System.out.println("Right:checked in");
		}
	}
}

public class TestFinalize{
	public static void main(String[] args){
		Book novel = new Book(true);
		novel.checkin();
//		(new Book(true)).checkin();
		System.gc();
	}
}
