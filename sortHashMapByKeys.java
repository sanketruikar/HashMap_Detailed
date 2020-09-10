package com.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class sortHashMapByKeys 
{
	public static void sort()
	{
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(new Integer(2), "One");
		hm.put(new Integer(1), "Two");
		hm.put(new Integer(3), "Three");
		hm.put(new Integer(4), "Four");
		
		for(Integer i:hm.keySet())
		{
			System.out.println("Key "+i+"values: "+hm.get(i));
		}
		TreeMap<Integer,String> tree=new TreeMap<Integer,String>(hm);
		for(Integer i:tree.keySet())
		{
			System.out.println("Key "+i+"values: "+tree.get(i));
		}
		
		
	}
	

}
