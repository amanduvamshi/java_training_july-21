package conditional_stmts;

public class Example3 {
	
	public void checkPassOrFail(int marks) {
	
		if(marks>=35) {
			System.out.println("****** Pass ******");
		}else {
			System.out.println("**** Fail  ******");
		}
	}

	public static void main(String[] args) {
		
		Example3 e3=new Example3();
		//  e3.checkPassOrFail(70);
		 e3.checkPassOrFail(34);

	}

}
