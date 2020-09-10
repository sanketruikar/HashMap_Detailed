package com.HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class iterateOverHashMap
{
	public static void iterate()
	{
		HashMap<String,String> hs=new HashMap<String,String>();
		hs.put("Name","Sanket");
		hs.put("Age","Twenty-Six");
		hs.put("Designation","Software Developer");
		hs.put("Address","Shinde Nagar Beed");
		System.out.println("HashMap ");
		for(Map.Entry<String, String> entry:hs.entrySet())
		{
			System.out.println(entry.getKey()+" :"+entry.getValue());
		}
		LinkedHashMap<String,String> lhs=new LinkedHashMap<String,String>();
		lhs.put("Name","Sanket");
		lhs.put("Age","Twenty-Six");
		lhs.put("Designation","Software Developer");
		lhs.put("Address","Shinde Nagar Beed");
		System.out.println("Linked HashMap ");
		for(Map.Entry<String, String> entry:lhs.entrySet())
		{
			System.out.println(entry.getKey()+" :"+entry.getValue());
		}
		
	}

}
