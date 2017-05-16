
/**
 * @author Bruna Ramos Vieira A00985171
 * COMP 1451 - Lab5b
 */

import java.util.HashMap;

public class Student extends Profile {
	private HashMap<String, Double> courses;

	/**
	 * Default constructor.
	 */
	public Student() {
	}

	/**
	 * @param firstName of the student.
	 * @param lastName of the student.
	 * @param email of the student.
	 * @param bcitId of the student.
	 */
	public Student(String firstName, String lastName, String email, String bcitId) {
		super(firstName, lastName, email, bcitId);
		courses = new HashMap<String, Double>();
	}

	/**
	 * Add new course and grades to the HashMap.
	 * 
	 * @param course is the course of the student.
	 * @param grade is the grade of the course of the student.
	 */
	public void addCourse(String course, double grade) {
		if (course != null && course.length() > 0) {
			if (grade > 0 && grade <= 100) {
				courses.put(course, grade);
			} else {
				System.out.println("Invalid grade for the student " + this.getFirstName() + "\n");
			}
		} else {
			System.out.println("Invalid course name for the student " + this.getFirstName() + "\n");
		}
	}
	
	/**
	 * Calculates the average of the student's grade.
	 * @return the average of the student's grade as a double.
	 */
	public double calculateAverage() {
		double total = 0;
		for (String course : courses.keySet()) {
			total += courses.get(course);
		}
		if (!courses.isEmpty()) { 
			return total/courses.size();
		} else {
			return 0.0;
		}
	}
}
