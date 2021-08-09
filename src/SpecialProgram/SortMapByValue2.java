package SpecialProgram;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class SortMapByValue2 {
	
   public static void main(String[] args) 
	    {
	        Map<Integer, String> Map = new HashMap<Integer, String>();

	        Map.put(111, "Lisa");
	        Map.put(222, "Narayan");
	        Map.put(333, "Xiangh");
	        Map.put(444, "Arunkumar");
	        Map.put(555, "Jyous");
	        Map.put(666, "Klusener");
	         
	        Map<Integer, String> sortedMap = Map.entrySet()
	                   .stream()
	                   .sorted(Entry.comparingByValue())
	                   .collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1,  e2) -> e1, LinkedHashMap::new));
	        System.out.println("Before Sorting : ");
	         
	        System.out.println(Map);
	         
	        System.out.println("After Sorting : ");
	         
	        System.out.println(sortedMap);
	    }
	}

