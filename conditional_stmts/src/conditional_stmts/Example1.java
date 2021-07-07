package conditional_stmts;

public class Example1 {
	
	// check passing number even or odd
	
	public void checkEvenOrOdd(int number) {
		
		if(number%2==0) {
			System.out.println("Even Number");
		}else {
			System.out.println("Odd Number....");
		}
		
	}

	public static void main(String[] args) {
		
         Example1 e =new Example1();
          e.checkEvenOrOdd(7);
        // e.checkEvenOrOdd(10);
        // e.checkEvenOrOdd(11);
	}

}
