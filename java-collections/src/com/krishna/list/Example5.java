package com.krishna.list;

import java.util.HashMap;
import java.util.Map;

public class Example5 {

	public static void main(String[] args) {
		Map<String, String> stateCapital=new HashMap<String, String>();
		
		stateCapital.put("Hyderabad","Telangana");
		stateCapital.put("Amaravathi","Andrapradesh");
		stateCapital.put("Hyderabad","Bihar");
		
		System.out.println(stateCapital);

	}

}
