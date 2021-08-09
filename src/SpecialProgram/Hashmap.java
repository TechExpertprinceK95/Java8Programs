package SpecialProgram;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap {
	public static void main(String args[])
	{
		Map map = new LinkedHashMap();
		map.put(101,"Prince Kumar");
		map.put(102,"Rahul");
		
		Set data = map.entrySet();
		Iterator it = data.iterator();
		while(it.hasNext())
		{
		Object obj = it.next();
		Map.Entry entry = (Map.Entry)obj;
		Object key = entry.getKey();
		Object value = entry.getValue();
		System.out.println("Key: "  +key+   " Value:" +value);
		if(map.containsKey(101)){
			System.out.println("Key Found");
		}else{
			System.out.println("Key not found");
		}
		{
			
		}
	}
	}
}
