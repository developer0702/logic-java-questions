package comparator;

import java.util.Comparator;

public class StudentMobile implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getMobile().compareTo(o2.getMobile());
	}

	
}
