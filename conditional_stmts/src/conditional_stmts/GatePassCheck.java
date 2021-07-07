package conditional_stmts;

public class GatePassCheck {
	
	public void identifyValidStudent(String id) throws Exception {
		
		if(id.startsWith("KIT")) {
			System.out.println("Valid Student...");
		}else {
			throw new Exception("Entry only for KITs students...");
		}
		
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		GatePassCheck pa=new GatePassCheck();
		pa.identifyValidStudent("LPO");

	}

}
