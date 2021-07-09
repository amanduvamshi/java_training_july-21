
public class Example6 {
	
	public static String sayHello() {
		return "Hello..";
	}
	
	public static boolean isIndian() {
		System.out.println("Entered into isIndian method...");
		return true;
	}

	public static void main(String[] args) {
		String response=sayHello();
		boolean isIndian=isIndian();
		System.out.println("Response ...."+response);
		System.out.println("isIndian ..."+isIndian);
	}
}
