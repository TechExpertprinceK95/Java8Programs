package ForEach;

import java.util.HashMap;

public class ForEachExampleOfMap {
	public static void main(String[] args) {
		HashMap<Integer,String> hmap = new HashMap<Integer,String>();
		hmap.put(1, "Prince");
		hmap.put(2, "Pawan");
		hmap.put(3, "Rahul");
		hmap.put(4, "Suresh");
		hmap.put(5, "paras");
		
		hmap.forEach((key,value)->
		System.out.println(key+" "+value));
		
		   hmap.forEach((key,value)->{
			   if(key == 4) {
				   System.out.println("Value associated with key 4 is:"+value);
			   }
		   });
		   hmap.forEach((key,value)->{
		         if("paras".equals(value)){ 
		            System.out.println("Key associated with Value Cat is: "+key);
		         }
		      }); 
		   }
		
	
}
