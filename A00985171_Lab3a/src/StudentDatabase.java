import java.util.*;

/**
 * This is a StudentDatabase class to store and change students quiz marks
 * 
 * @author bruna
 */
public class StudentDatabase {

	private HashMap<String, int[]> quizMarks;
	public static final int NUM_QUIZZES = 10;
	public static final int MIN_GRADE = 0;
	public static final int MAX_GRADE = 100;

	/**
	 * Constructor to create HashMap array of students quiz marks
	 */
	public StudentDatabase() {
		quizMarks = new HashMap<>();
	}

	/**
	 * @param name
	 *            students name
	 * @return name of student with first letter upper case and then lower case
	 */
	private String formatName(String name) {

		if (name != null && name.trim().length() > 0) {
			return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
		} else {
			return null;
		}
	}

	/**
	 * @param studentName
	 *            add student to the array list
	 */
	public void addStudent(String studentName) {

		if (studentName != null && studentName.trim().length() > 0) {
			quizMarks.put(formatName(studentName), new int[NUM_QUIZZES]);
		} else {
			System.out.println("Student name must not be null");
		}
	}

	/**
	 * @param student
	 *            name of student
	 * @return marks from student named
	 */
	public int[] getQuizzes(String student) {

		if (student != null && student.trim().length() > 0) {
			return quizMarks.get(formatName(student));
		} else {
			System.out.println("Student name must not be null");
			return null;
		}
	}

	/**
	 * @param studentName
	 *            name of student
	 * @param whichQuiz
	 *            quiz you want to change marks on
	 * @param newMark
	 *            new mark for quiz you want to change
	 */
	public void changeQuizMark(String studentName, int whichQuiz, int newMark) {

		if (quizMarks.get(formatName(studentName)) != null && whichQuiz < NUM_QUIZZES) {
			if (newMark >= MIN_GRADE && newMark <= MAX_GRADE) {
				int[] oldQuiz = quizMarks.get(formatName(studentName));
				oldQuiz[whichQuiz] = newMark;
				quizMarks.put(formatName(studentName), oldQuiz);
			} else {
				System.out.println("Marks must be within 0 and 100.");
			}
		} else {
			System.out.println("Name is invalid or quiz chosen is invalid.");
		}
	}

	/**
	 * prints the students name and all 10 quiz marks
	 */
	public void showQuizMarks() {

		if (this.quizMarks.size() > 0) {
			for (String studentNames : quizMarks.keySet()) {
				System.out.print("Quiz marks for: " + studentNames);
				for (int mark : quizMarks.get(studentNames)) {
					System.out.print(" " + mark);
				}
				System.out.println();
			}
		}
	}
}
