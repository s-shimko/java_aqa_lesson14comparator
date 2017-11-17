package by.htp.stud.bean;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student st1, Student st2) {
		String stName1 = st1.getName();
		String stName2 = st2.getName();

		int age1 = st1.getAge();
		int age2 = st2.getAge();

		if (stName1.compareTo(stName2) < 0) {
			return -1;
		} else if (stName1.compareTo(stName2) > 0) {
			return 1;
		} else {
			if (age1 < age2) {
				return -1;
			} else if (age1 > age2) {
				return 1;
			} else {
				return 0;
			}
		}
	}

}
