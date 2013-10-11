class Base{
	public void A(){
		System.out.println("Base.A() public");
	}
	protected void B(){
		System.out.println("Base.B() protected");

	}
	private void C(){
		System.out.println("Base.C() private");
	}

	public void print(Base base){
		base.A();
		base.B();
		base.C();
	}

}

public class TestUpcast extends Base{
	public void A(){
		System.out.println("TestUpcast.A() public");
	}
	protected void B(){
		System.out.println("TestUpcast.B() protected");
	}
	private void C(){
		System.out.println("TestUpcast.C() private");
	}

	public static void main(String[] args){
		Base base1 = new TestUpcast();
		base1.print(base1);
		TestUpcast base2= new TestUpcast();
		base2.print(base2);
		Base base3 = new Base();
		base3.print(base3);
	}
}
