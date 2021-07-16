
public class AccountInformation {
	
	String name;
	int age;
	String email;
	Double accountBalance;
	String accountType;
	String branch;
	String ifscCode;
	
	public String deposit(double amount) {
		System.out.println("Before Deposit Balance:"+accountBalance);
		accountBalance=accountBalance+amount;

		return "Amount Succesufully Credited into u r account, total balance is "+accountBalance;
	}
	
	
	public static void main(String[] args) {
		
		AccountInformation accountInfo=new AccountInformation();
		accountInfo.name="Krishna";
		accountInfo.age=29;
		accountInfo.email="krishna@gmail.com";
		accountInfo.accountBalance=10000d;
		accountInfo.accountType="savings";
		accountInfo.branch="subashNagar";
		accountInfo.ifscCode="SBI1234N";
		
		AccountInformation accountInfo1=new AccountInformation();
		accountInfo1.name="Ram";
		accountInfo1.age=49;
		accountInfo1.email="Ram@gmail.com";
		accountInfo1.accountBalance=50000d;
		accountInfo1.accountType="current";
		accountInfo1.branch="Namdevwada";
		accountInfo1.ifscCode="SBI1239N";
		

		AccountInformation accountInfo2=new AccountInformation();
		accountInfo2.name="Raj";
		accountInfo2.age=24;
		accountInfo2.email="Raj@gmail.com";
		accountInfo2.accountBalance=90000d;
		accountInfo2.accountType="Savings";
		accountInfo2.branch="Ganagastan";
		accountInfo2.ifscCode="SBI19839N";
		
		
		System.out.println(accountInfo2.deposit(10000d));
		
	}


	@Override
	public String toString() {
		return "AccountInformation [name=" + name + ", age=" + age + ", email=" + email + ", accountBalance="
				+ accountBalance + ", accountType=" + accountType + ", branch=" + branch + ", ifscCode=" + ifscCode
				+ "]";
	}
	
	

}
