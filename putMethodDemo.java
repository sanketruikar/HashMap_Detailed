package com.HashMap;

import java.util.HashMap;
import java.util.Set;

public class putMethodDemo 
{
	public static void put1()
	{
		HashMap<Integer,String> hs=new HashMap<Integer,String>();
		hs.put(2,null);
		System.out.println(hs.put(1,"one"));
		System.out.println(hs);
		System.out.println(hs.putIfAbsent(1,"Two"));
		System.out.println(hs.putIfAbsent(2,"Three"));
		System.out.println(hs);
		
		
		
	}

}
