package com.HashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class sortByValues 
{
	public static void valuesSort()
	{
		HashMap<String,Integer> hsm=new HashMap<String,Integer>();
		hsm.put("Three",3);
		hsm.put("Four",4);
		hsm.put("One",1);
		hsm.put("Two",2);
		System.out.println(hsm);
		
		List<Integer>l=new ArrayList<Integer>(hsm.values());
		Collections.sort(l);
		
		
		for(Integer i:l)
		{
			System.out.println(l);
		}
		
		
		
		
		
		
		
		
		
		
	}

}
