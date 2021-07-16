
public class Example7 {
	
	int c;
	int d;

	int b=m1();
	public int m1() {
		System.out.println("......m1......");
		return 10;
	}
	{
		System.out.println("ns-b-1");
	}
	{
		System.out.println("ns-b-2");
	}
	Example7(){
		System.out.println("A value:"+a+" B value is:"+b);
		System.out.println("C value:"+c+" D value is:"+d);
	}
	public static void main(String[] args) {
		
		Example7 e7=new Example7();
		e7.c=40;
		e7.d=90;
		System.out.println("C value:"+e7.c+" D value is:"+e7.d);
	
	}
	
	int a=m1();


}
