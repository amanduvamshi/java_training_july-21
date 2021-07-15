
public class Example3 {

	public static int m1() {
		System.out.println("s-m1");
		return 10;
	}

	public  int m2() {
		System.out.println("s-m1");
		return 10;
	}
	static int a = m1();

	static {
		System.out.println("s-b1");
		Example3 e4=new Example3();
		e4.m2();
	}

	public static void main(String[] args) {
		System.out.println("main");
	}

	static {
		System.out.println("s-b2");
	}

}
