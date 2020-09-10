package com.HashMap;

import java.util.HashMap;

public class replaceValueUsingKey 
{
	public static void replace1()
	{
		HashMap<Integer,String>hs=new HashMap<Integer,String>();
		hs.put(1, "One");
		hs.put(2, "Two");
		
		hs.put(3, "Three");
		
		System.out.println(hs);
		
		String oldValue=hs.put(2, "Twenty");
		System.out.println(oldValue);
		System.out.println(hs);
		
		
	}
	public static void replace2()
	{
		HashMap<Integer,String>hs=new HashMap<Integer,String>();
		hs.put(1, "One");
		hs.put(2, "Two");
		
		hs.put(3, "Three");
		
		System.out.println(hs);
		
		
		System.out.println(hs.replace(2,"Twenty"));
		System.out.println(hs);
		//IF key Doest NOt present replace method returns NUll
		System.out.println(hs.replace(4,"Twenty"));
		
		
	}

}
