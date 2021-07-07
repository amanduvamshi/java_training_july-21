package conditional_stmts;

public class Example4 {
	
	public void iplWinningTeamBasedOnYear(int year) {
		
		switch(year) {
		case 2008:
			System.out.println("Rajasthan Royals...");
			break;
		case 2009:
			System.out.println("Deccan charges....");
			break;
		case 2010:
			System.out.println("Chennai Super kings...");
			break;
		case 2011:
			System.out.println("Chennai Super Kings...");
			break;
	    default:
	    	System.out.println("Data Not Found.....");
		}
		
	}
	
	public static void main(String[] args) {
		
		Example4 e4=new Example4();
		e4.iplWinningTeamBasedOnYear(2011);
	}

}
