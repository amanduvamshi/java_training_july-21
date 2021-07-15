
public class Example5 {
	int actualAmount=10000;
	int withdraw(int returnAmount) {
		actualAmount=actualAmount-returnAmount;
		return actualAmount-returnAmount;
	}

	public static void main(String[] args) {
		Example5 e5=new Example5();
		System.out.println("Before Return:"+e5.actualAmount);
		e5.withdraw(1000);
		System.out.println("After Return:"+e5.actualAmount);
		

	}

}
