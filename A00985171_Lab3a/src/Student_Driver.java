/**
 * This is a tester class to invoke methods in StudentDatabase class
 * 
 * @author bruna
 * 
 */
public class Student_Driver {

	/**
	 * Default Constructor
	 */
	public Student_Driver() {
	}

	/**
	 * @param args
	 *            invoking the StudentDatabase methods and testing them
	 */
	public static void main(String[] args) {

		// Creating new array of students for StudentDatabase class
		StudentDatabase quizMarks = new StudentDatabase();
		
		String[] students = { "BRuna", "GUI", "CHRYTian", "MaRIa", "elder" };
		
		System.out.println("[TEST 01]");

		// Adding a student to the list
		for (String student : students) {
			quizMarks.addStudent(student);
		}

		// Retrieving students name and quizzes
		for (String student : students) {
			quizMarks.getQuizzes(student);
		}

		// Changing a certain quiz and the marks on the quiz
		for (String student : students) {
			quizMarks.changeQuizMark(student, 5, 70);
		}

		// Prints the name and students quiz marks
		quizMarks.showQuizMarks();
		
		System.out.println();
		
		System.out.println("[TEST 02]");
		
		// Adding a student to the list
		for (String student : students) {
			quizMarks.addStudent(student);
		}

		// Retrieving students name and quizzes
		for (String student : students) {
			quizMarks.getQuizzes(student);
		}

		// Changing a certain quiz and the marks on the quiz
		for (String student : students) {
			quizMarks.changeQuizMark(student, 5, 150);
		}				
	}

}
