package com.krishna.example.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String, String> playerSports=new HashMap<String, String>();
		playerSports.put("Dhoni", "Cricket");
		playerSports.put("Djokovic", "Tennis");
		playerSports.put("Messi", "Football");
		
		System.out.println("Players And Sports:"+playerSports);

	}

}
