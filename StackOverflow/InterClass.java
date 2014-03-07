public class InterClass
{
	int x = 0;
	
	public void foo(){
		this.toString();
	};

	public static void main(String[] args){
		InterClass interClass1 = new InterClass();
		InterClass interClass2 = new InterClass(){
			public void foo(){
				System.out.println("this is in foo of interClass2");
			}
		};

		interClass1.x = 10;
		interClass2.x = 20;
		interClass1.foo();
		interClass2.foo();
		System.out.println(interClass1.x + "----" + interClass2.x);
		System.out.println(interClass1 + "----" + interClass2);
	}
}
