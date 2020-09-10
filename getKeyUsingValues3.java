package com.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class getKeyUsingValues3 
{
	public static void get()
	{  
		HashMap<Integer,String> hs=new HashMap<Integer,String>();
		hs.put(1,"One");
		hs.put(2,"Two");
		hs.put(3,"Three");
		hs.put(4,"Three");
		hs.put(5,"Three");
		
		String value="Three";
		List<Integer> l=new ArrayList<Integer>();
		
		for(Map.Entry<Integer,String> entry :hs.entrySet())
		{
			if(entry.getValue().equals(value))
			{
				l.add(entry.getKey());
			}
		}
		System.out.println(l);
		
		
	}

}
