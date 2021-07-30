package com.krishna;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example1 {
	
	static List<String> nonProdData=Arrays.asList("Ramu","Bharat");
	
	static List<String> prodData=Arrays.asList("Krishna","Arjun");

	public static void main(String args[]) throws IOException {
		
			File file = new File("application.properties"); 
			FileReader fr = new FileReader(file); 
			BufferedReader br = new BufferedReader(fr); 
			StringBuffer sb = new StringBuffer(); 
			String line;
			while ((line = br.readLine()) != null) {
				sb.append(line); 
			}
			fr.close(); 
			
			String env=sb.substring(sb.indexOf(":")+1, sb.length());
			System.out.println(env);
			
			if("nonProd".equalsIgnoreCase(env)) {
				//non prod config enable.
				System.out.println("Users:"+nonProdData);
			}else if(env.equals("production")) {
				//prod configurations enable
				System.out.println("Users:"+prodData);
			}
			
		} 
	}
