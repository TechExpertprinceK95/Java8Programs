package SpecialProgram;
import java.util.HashMap;
public class Merge2Map {
	
   public static void main(String[] args) 
	    {
	        HashMap<String, Integer> Map1 = new HashMap<>();
	         
	        Map1.put("Maths", 45);
	        Map1.put("Physics", 57);
	        Map1.put("Chemistry", 52);
	        Map1.put("History", 41);
	         
	        HashMap<String, Integer> Map2 = new HashMap<>();
	         
	        Map2.put("Economics", 49);
	        Map2.put("Maths", 42);
	        Map2.put("Biology", 41);
	        Map2.put("History", 55);

	        HashMap<String, Integer> Map3 = new HashMap<>(Map1);
	         
	        Map2.forEach((key, value) ->Map3.merge(key, value, (v1, v2) -> v1+v2));

	        System.out.println("Map 1 : "+Map1);
	         
	        System.out.println("Map 2 : "+Map2);
	         
	        System.out.println("Map 3 : "+Map3);
	    }
	}


