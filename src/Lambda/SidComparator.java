package Lambda;

import java.util.Comparator;

class SidComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		return s1.getSid()-s2.getSid();
	}

}