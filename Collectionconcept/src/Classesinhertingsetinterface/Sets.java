package Classesinhertingsetinterface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Sets {
	public static void main(String[] args) {
		//HashSet<Integer> hs=new HashSet<Integer>();
		//LinkedHashSet<Integer> hs=new LinkedHashSet<Integer>();
		//TreeSet<Integer> hs=new TreeSet<Integer>();
	//	ArrayList<Integer> hs=new ArrayList<Integer>();
		//LinkedList<Integer> hs=new LinkedList<Integer>();
		ArrayList<Integer> hs=new ArrayList<Integer>();
		hs.add(12);
		hs.add(1223); 
		hs.add(333);
		hs.add(23445);
		hs.add(32234);
		hs.add(2144);
		hs.add(12);
		for(Integer i : hs)
		{
			System.out.println(i);
			
		}
	}
      
}
