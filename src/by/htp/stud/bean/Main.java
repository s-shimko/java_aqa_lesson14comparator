package by.htp.stud.bean;

public class Main {

	public static void main(String[] string) {
		Student st1 = new Student("Alesha", 20);
		Student st2 = new Student("Vitya", 19);
		Student st3 = new Student("Olya", 22);
		Student st4 = new Student("Olya", 21);

		Group group = new Group(4);

		Student[] students = group.getStudents();

		group.addStudent(st1, 0);
		group.addStudent(st2, 1);
		group.addStudent(st3, 2);
		group.addStudent(st4, 3);

		System.out.println("Before sort Age");
		for (Student st : students) {
			System.out.println(st);
		}

		// group.sortStudentsByNameAge(students);

		System.out.println("");
		System.out.println("After sort NameAge");
		for (Student st : group.sortStudentsByNameAge(students)) {
			System.out.println(st);
		}

	}

}
