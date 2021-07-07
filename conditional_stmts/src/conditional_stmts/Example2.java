package conditional_stmts;

public class Example2 {
	
	public void checkColor(String name) {
		if(name == "Red") {
			System.out.println("#### Red color ####");
		}else if(name == "Green") {
			System.out.println("#### Green Color ####");
		}else if (name == "White") {
			System.out.println("#### White color ####");
		}else {
			System.out.println(" #### Black color ####");
			return;
		}
		System.out.println("**********END**********");
	}

	public static void main(String[] args) {
		
		Example2 e2=new Example2();
		//e2.checkColor("White");
		e2.checkColor("Xyxz");
	}

}
