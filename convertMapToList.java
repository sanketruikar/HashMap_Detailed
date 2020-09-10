package com.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class convertMapToList 
{
	public static void convert1()
	{
		HashMap<String,Employee> hs=new HashMap<String,Employee>();
		
		hs.put("Employee_One",new Employee(1,"Sanket Ruikar",23));
		hs.put("Employee_Two",new Employee(2,"Kalpesh Wani",23));
		hs.put("Employee_Three",new Employee(3,"Rohan Dube",23));
		
		List<String> l=new ArrayList<String>(hs.keySet());
		for(String s:l)
		{
			System.out.println(s);
		}
		
		List<Employee> l2=new ArrayList<Employee>(hs.values());
		for(Employee st:l2)
		{
			System.out.println(st);
		}
		
		
	}

}
