package Classesinhertingsetinterface;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class LinkedHashmapconcept {

public static void main(String[] args) {
		
	   LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();
	  //  TreeMap<Integer,String> hm=new TreeMap<Integer,String>();
		hm.put(111, "Deepak");
		hm.put(123, "Aman");
		hm.put(134, "API");
		hm.put(145, "Java");
		hm.put(235, "Postman");  
		hm.put(456, "SoapUi"); 
		Set<Integer> allkeys=hm.keySet(); 
		for(Integer i:allkeys)
		{
		System.out.println("Key is "+i);	
		System.out.println("Value is "+hm.get(i));
		}
	}
}
