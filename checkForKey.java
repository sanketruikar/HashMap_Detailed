package com.HashMap;

import java.util.HashMap;

public class checkForKey 
{
	public static void check1()
	{
		HashMap<Integer,String >hs=new HashMap<Integer,String>();
		hs.put(1,"One");
		hs.put(2,"Two");
		hs.put(3,"Three");
		hs.put(4,null);
		
		String value=hs.get(4);
		System.out.println(value);
		if(value!=null)
		{
			System.out.println("Key is  Present");
		}
		else
		{
			System.out.println("Key is Not   Present");
		}
		
			
		
	}
	public static void check2()
	{
		HashMap<Integer,String >hs=new HashMap<Integer,String>();
		hs.put(1,"One");
		hs.put(2,"Two");
		hs.put(3,"Three");
		hs.put(4,null);
		
		boolean keyPresent=hs.containsKey(6);
		if(keyPresent)
		{
			System.out.println("Key is Present");
		}
		else
		{
			System.out.println("Key is not  Present");
		}
				
		
			
		
	}


}
