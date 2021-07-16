
public class Example6 {
	
	
	{
		System.out.println("ns-b-1");
	}

	{
		System.out.println("ns-b-2");
	}
	
	Example6(){
		System.out.println("no-arg-constructor");
	}
	Example6(int a){
		
		System.out.println("arg-constructor");
	}
	public static void main(String[] args) {
		
		Example6 e6=new Example6(1);
		Example6 e7=new Example6();

	}
	{
		System.out.println("ns-b-3");
	}
}
