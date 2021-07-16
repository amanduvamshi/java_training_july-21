
public class Example8 {
	
	public void m1() {
		System.out.println("im in m1");
	}
	
	static {
		System.out.println("Entered into Static block");
	
		Example8 e8=new Example8();
		
		System.out.println("After Object Creation....");
	}
	static {
		System.out.println("second static block");
	}
	{
		System.out.println("ns1");
		m1();
	}
	Example8(){
		System.out.println("constructor....");
	}

	public static void main(String[] args) {
		System.out.println("I'm in main.....");
		

	}
	{
		System.out.println("ns2");
	}
}
