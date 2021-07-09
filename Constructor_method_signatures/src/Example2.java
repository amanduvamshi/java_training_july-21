
public class Example2 {
	
	int x;
	int y;
	// At the time object creation it allocates with default values
	public Example2() {
		System.out.println("Example2....");
	}
	
	public Example2(int a , int b) {
		System.out.println("X value:"+x+" Y value:"+y);
		
		this.x=a;
		this.y=b;
		System.out.println(".....Parameterized Constructor.....");
	}
	public static void main(String[] args) {
		Example2 e2=new Example2(2,3);
		
	}

}
