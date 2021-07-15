
public class Example4 {
	
	String name;   // 8 bytes
	String email;  // 8 bytes
	int age;       //4 bytes
	static String  branch;  //8 bytes
	public static void main(String[] args) {
		Example4 e4=new Example4();
		e4.name="Krishna";
		e4.email="krishna@gmail.com";
		e4.age=29;
		e4.branch="Hyd";//8
		Example4 e5=new Example4();
		e5.name="Krishna";
		e5.email="krishna@gmail.com";
		e5.age=29;
		e5.branch="Hyd";//8
	}

}
