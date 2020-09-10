package com.HashMap;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class readTextFileToHashMap 
{  
	final static String filePath = "D:\\Study\\Java\\JavaByKiran\\HashMapDemo\\FileSa.txt";
	public static void main(String[] args) throws IOException 
	{
		Map<String,Integer> hsmap=getHashMapFromTextFile();
		
		for(Map.Entry<String, Integer> entry : hsmap.entrySet()){
            System.out.println( entry.getKey() + " => " + entry.getValue() );
        }
		
	}
	private static Map<String, Integer> getHashMapFromTextFile() throws IOException {
		Map<String,Integer> m=new HashMap<String,Integer>();
		
		BufferedReader br=null;
		
		File file=new File(filePath);
		br=new BufferedReader( new FileReader(file));
		String line=null;
		while((line=br.readLine())!=null)
		{
			String [] parts=line.split(":");
			String name=parts[0].trim();
			Integer age=Integer.parseInt(parts[1].trim());
			if(!name.equals("")&&!age.equals(""))
			{
				m.put(name,age);
			}
			
		}
		return m;
	}

}
