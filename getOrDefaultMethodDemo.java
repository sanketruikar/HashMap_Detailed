package com.HashMap;

import java.util.HashMap;
import java.util.Set;

public class getOrDefaultMethodDemo 
{

	public static void get1()
	{  
		HashMap<Integer,String> hs=new HashMap<Integer,String>();
		hs.put(1,"One");
		hs.put(2,null);
		hs.put(3,"Three");
		
		
		System.out.println(hs.get(2));
		System.out.println(hs.containsKey(4));
		System.out.println(hs.getOrDefault(4,"Not present"));
		
		
	}
}
