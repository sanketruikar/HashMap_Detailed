package com.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class getKeyUsingValue2 
{
	public static void get2()
	{  
		HashMap<Integer,String> hs=new HashMap<Integer,String>();
		hs.put(1,"One");
		hs.put(2,"Two");
		hs.put(3,"Three");
		String value="One";
		
		for(Map.Entry<Integer,String> entry :hs.entrySet())
		{
			if(entry.getValue().equals(value))
			{
				System.out.println(entry.getKey());
			}
		}
		
		
	}

}
