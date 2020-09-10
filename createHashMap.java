package com.HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class createHashMap 
{
	public static void create()
	{
		HashMap<String,String> hs=new HashMap<String,String>();
		hs.put("Name","Sanket");
		hs.put("Age","Twenty-Six");
		hs.put("Designation","Software Developer");
		hs.put("Address","Shinde Nagar Beed");
		System.out.println("Below is HashMap which doesnot maintain Insertion Order");
		System.out.println(hs);
		
		LinkedHashMap<String,String> lhs=new LinkedHashMap<String,String>();
		lhs.put("Name","Sanket");
		lhs.put("Age","Twenty-Six");
		lhs.put("Designation","Software Developer");
		lhs.put("Address","Shinde Nagar Beed");
		System.out.println("Below is LinkedHashMap which doesnot maintain Insertion Order");
		System.out.println(lhs);
		
	}

}
