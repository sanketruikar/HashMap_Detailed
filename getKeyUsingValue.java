package com.HashMap;

import java.util.HashMap;
import java.util.Set;
//One To One Mapping
public class getKeyUsingValue 
{
	public static void get1()
	{  
		HashMap<Integer,String> hs=new HashMap<Integer,String>();
		hs.put(1,"One");
		hs.put(2,"Two");
		hs.put(3,"Three");
		String value="One";
		
		Set<Integer>keys=hs.keySet();
		System.out.println(keys);
		
		for(Integer i:keys)
		{
			if(hs.get(i).equals(value))
			{
				System.out.println(i);
			}
		}
		
		
	}
	
	

}
