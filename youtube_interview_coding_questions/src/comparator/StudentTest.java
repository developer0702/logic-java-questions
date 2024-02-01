package comparator;

import java.util.ArrayList;
import java.util.Collections;



public class StudentTest {
	public static void main(String[] args) {

		ArrayList<Student> list= new ArrayList<>();
		list.add(new Student(16,"smith","7894561230"));
		list.add(new Student(12,"Aikash","7894561240"));
		list.add(new Student(13,"john","7894561290"));
		list.add(new Student(14,"stallin","7894561270"));
		System.out.println(list);
		System.out.println("**********");
		
		ArrayList<Student> student2= new ArrayList<>(list);
		Collections.sort(student2,new StudentIde());
		System.out.println(student2);
		
		ArrayList<Student> student3= new ArrayList<>(list);
		Collections.sort(student3,new StudentName());
		System.out.println(student3);
		
		ArrayList<Student> student4= new ArrayList<>(list);
		Collections.sort(student4,new StudentMobile());
		System.out.println(student4);
		
		
	}
}
