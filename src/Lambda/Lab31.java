package Lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lab31 {
	public static void main(String[] args) {
		List<Student> students = Arrays.asList(
			     new Student(11,"Prince",123456L),
				 new Student(21,"ram",11111L),
				 new Student(33,"kishan",18888L),
				 new Student(55,"krishna",17777L),
				 new Student(66,"ramesh",122222L),
				 new Student(29,"suresh",133333L));
		Comparator<Student> comp=(s1,s2)-> s1.getSid()-s2.getSid();
		Collections.sort(students,comp);
		for(Student student:students) {
			System.out.println(student);
		}
		
	}

}
