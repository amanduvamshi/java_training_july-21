package com.krishna.oops.test;

import com.krishna.dto.UserDTO;
import com.krishna.oops.encapsulation.VoterCardForm;

public class Test {
	
	public void registration(UserDTO userDto) {
		
	}

	public static void main(String[] args) throws Exception {
		
		VoterCardForm vcf=new VoterCardForm();
	
		vcf.setName("krishna");
		vcf.setAge(20);
		vcf.setStreet("namedevwada");
		vcf.setCity("Nzb");
		System.out.println(vcf);

	}

}
