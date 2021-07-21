package fa.training.assignment5;

import java.util.Scanner;

public class CourseManagement {
	public static void find(String type, Course[] course) {
		boolean check = true;

		for (int i = 0; i < course.length; i++) {
			if (course[i].getId().equals(type)) {
				System.out.println(course[i]);
				check = false;
			} else if (course[i].getName().equals(type) ) {
				System.out.println(course[i]);
				check = false;
			} else if (course[i].getStatus().equals(type)) {
				System.out.println(course[i]);
				check = false;
			} else if (course[i].getFlag().equals(type)) {
				System.out.println(course[i]);
				check = false;
			}
		}

		if (check) {
			System.out.println("No data");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		Course[] course = new Course[10];

//		course[0] = new Course("FW001", "SQL", 4.0, "active", "optional");
//
//		course[1] = new Course("FW002", "Java", 4.0, "active", "optional");
//
//		course[2] = new Course("FW004", "Ruby", 3.0, "in-active", "mandatory");
//
//		course[3] = new Course("FW005", "C++", 2.0, "in-active", "mandatory");
//
//		course[4] = new Course("FW006", "Js", 4.0, "active", "N/A");
//		
//		course[5] = new Course("FW007", "C#", 5.0, "active", "N/A");
//		
//		course[6] = new Course("FW008", "JSP", 2.0, "in-active", "N/A");
//		
//		course[7] = new Course("FW009", "NodeJS", 1.0, "active", "N/A");
//		
//		course[8] = new Course("FW0010", "Js", 8.0, "in-active", "N/A");
//		
//		course[9] = new Course("FW0011", "PHP", 9.0, "active", "N/A");
//		
//
		Course[] course = new Course[2];
		for (int i = 0; i < course.length; i++) {
			System.out.println("1. Enter the course " + (i + 1));
			course[i] = new Course();
			course[i].input();
		}

		System.out.println("2. Display all course");
		for (Course item : course) {
			System.out.println(item);
		}

		System.out.println("3. Find course by value (name,code,status,type)");
		String value = sc.nextLine();
		find(value, course);

		System.out.println("4. Display all course with flag is mandatory");

		find("mandatory", course);
		
	}
}
