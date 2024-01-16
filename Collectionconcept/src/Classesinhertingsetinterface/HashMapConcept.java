package Classesinhertingsetinterface;

import java.util.HashMap;
import java.util.Set;

public class HashMapConcept {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>(); //HashMap<key,value> hm=new HashMap<Integer,String>()
		hm.put(11, "Deepak");
		hm.put(1122, "DC");
		hm.put(333, "automation");
		hm.put(3333, "API");
		hm.put(11111, "API Testing");  
		
		Set<Integer> allkeys=hm.keySet(); 
		for(Integer i:allkeys)
		{
		System.out.println("Key is "+i+ " Value is "+hm.get(i));	
		}
	}
}
