package by.htp.stud.bean;

public class Group {

	private static Student[] students;

	public Group(int size) {
		Student[] allStudents = new Student[size];
		this.students = allStudents;
	}

	static void addStudent(Student student, int index) {
		students[index] = student;
	}

	public static Student[] getStudents() {
		return students;
	}

	public static void setStudents(Student[] students) {
		Group.students = students;
	}

	// comparable
	public Student[] sortStudentsByAge(Student[] students) {
		int n = students.length;
		Student temp = null;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (students[j - 1].compareTo(students[j]) > 0) {
					temp = students[j - 1];
					students[j - 1] = students[j];
					students[j] = temp;
				}
			}
		}
		return students;
	}

	// Comparator
	public Student[] sortStudentsByNameAge(Student[] students) {
		StudentComparator stcmp = new StudentComparator();
		int n = students.length;
		Student temp = null;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (stcmp.compare(students[j - 1],students[j]) > 0) {
					temp = students[j - 1];
					students[j - 1] = students[j];
					students[j] = temp;
				}
			}
		}
		return students;
		
	}

}
