package SpecialProgram;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortMapByValue {

	    public static void main(String[] args) 
	    {

	        Map<Integer, String> Map = new HashMap<Integer, String>();

	        Map.put(111, "Lisa");
	        Map.put(222, "Narayan");
	        Map.put(333, "Xiangh");
	        Map.put(444, "Arunkumar");
	        Map.put(555, "Jyous");
	        Map.put(666, "Klusener");
	        
	        List <Entry <Integer, String> > Entry = new LinkedList<> (Map.entrySet());

	        Collections.sort(Entry, new Comparator<Entry<Integer, String>>() 
	        {
	            @Override
	            public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) 
	            {
	                return o1.getValue().compareTo(o2.getValue());
	            }
	        });

	        Map <Integer, String> sortedMap = new LinkedHashMap<Integer, String>();
	         
	        for (Entry <Integer, String> entry : Entry) 
	        {
	            sortedMap.put(entry.getKey(), entry.getValue());
	        }

	        System.out.println("Before Sorting : ");
	         
	        System.out.println(Map);
	         
	        System.out.println("After Sorting : ");
	         
	        System.out.println(sortedMap);
	    }
	}

