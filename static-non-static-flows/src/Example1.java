
public class Example1 {
	
	static int a=method1();
	static int b=20;
	
	public static void method2() {
		System.out.println("****** method2 ******");
	}
	
	static {
		System.out.println("*** static block 1***");
	}
	
	static {
		System.out.println("*** static block 2****");
	}
	
	public static int method1() {
		System.out.println("****** method1 ******");
		return 10;
	}

	public static void main(String[] args) {
		System.out.println("*** Main method ***");
		method1();
		method2();
		
	}
	static {
		System.out.println("*** static block 3****");
	}
	static int c=method1();

}
