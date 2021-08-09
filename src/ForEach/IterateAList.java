package ForEach;

import java.util.ArrayList;
import java.util.List;

public class IterateAList {
	public static void main(String[] args) {
		List<String> fruit  = new ArrayList<String>();
		fruit.add("Apple");
		fruit.add("Apple");
		fruit.add("Apple");
		fruit.add("Apple");
		fruit.add("Apple");
		fruit.add("Apple");
		fruit.add("Apple");
		fruit.add("Apple");
		fruit.forEach(str->{System.out.println(str);
		
	});
	}
}
