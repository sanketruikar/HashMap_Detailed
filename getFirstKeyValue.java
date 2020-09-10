package com.HashMap;

import java.util.HashMap;

public class getFirstKeyValue 
{
	public static void put1()
	{
		HashMap<Integer,String> hs=new HashMap<Integer,String>();
		hs.put(1, "One");
		hs.put(11, "Eleven");
		hs.put(21, "TwentyOne");
		
		Integer key=hs.entrySet().stream().findFirst().get().getKey();
		System.out.println(key);
		
		String value=hs.entrySet().stream().findFirst().get().getValue();
		System.out.println(value);
		
		
		
	}

}
