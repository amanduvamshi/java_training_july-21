
public class Example3 extends Example2 {
	
	public Example3() {
		System.out.println("Example3... Constructor...");
	}
	
	public Example3(int a, int b) {
		super(a,b);
		System.out.println("Example 3 Parametrized Constructor....");
	}
	
	public Example3(Example2 e3) {
		Example2 e2=e3;
		System.out.println("Example 3 Parametrized Constructor....");
	}
	


	public static void main(String[] args) {
		
		Example3 e3=new Example3(2,3); 
		
		Example3 e4=new Example3(new Example2());
		
		
		 e4.x=10;
		 e4.y=20;
		System.out.println("X value:"+e3.x+" Y Value is :"+e3.y);
		System.out.println("X value:"+e4.x+" Y Value is :"+e4.y);
		
	}

}
