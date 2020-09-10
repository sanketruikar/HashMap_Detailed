package com.HashMap;

import java.util.HashMap;

public class checkForValues
{
	public static void checkValue()
	{
		HashMap<Integer,String> hs=new HashMap<Integer,String>();
		hs.put(1,"One");
		hs.put(2,"Two");
		hs.put(3,"Three");
		
		System.out.println(hs.containsValue("Two"));
	}

}
