
public class Example5 {
	
	public static int method1() {
		System.out.println("....Method1");
		return 5;
	}
	
	public static Integer method2() {
		System.out.println(".... Method2");
		return 5;
	}

	public static void main(String[] args) {
		
		int method1Result=method1();
		int method2Result=method2();
		
         int result=  method1()+method2();
         
         System.out.println("Method1 Result..."+method1Result);
         System.out.println("Method2 Result..."+method2Result);
         System.out.println("Result...."+result);
	}

}
