import java.text.DecimalFormat;

/**
 * @author Bruna Ramos Vieira A00985171
 * COMP 1451 - Lab5b
 */
public class Driver {

	public static void main(String[] args) {
		
		//DecimalFormat patterns to format double numbers
		 DecimalFormat df = new DecimalFormat("#0.00");  

		 
		//Adds some students 
		Student student_1 = new Student("Bruna", "Vieira", "bruna@gmail.com", "A00985171");
		Student student_2 = new Student("Guilherme", "Cruz", "gui@gmail.com", "A00985172");
		Student student_3 = new Student("Chrystian", "Vieira", "chrystian@gmail.com", "A00985173");
		
		//Adds some courses for each student		
		student_1.addCourse("Math", 100.00);
		student_1.addCourse("English", 62);
		student_2.addCourse("Math", 89.56);
		student_2.addCourse("English", 99.12);
		student_3.addCourse("Math", 87.45);
		student_3.addCourse("English", 94.03);
		
		//Adds some instructors 
		Instructor instructor_1 = new Instructor("Carlos", "Silva", "carlos@gmail.com", "IN0045891", 53.25);
		Instructor instructor_2 = new Instructor("William", "Smith", "william@gmail.com", "IN0045892", 30.75);
		Instructor instructor_3 = new Instructor("Angel", "Chan", "angel@gmail.com", "IN0045893",63.48);
		
		Database database = new Database();
		
		//Add the student profile
		database.addProfile(student_1);
		database.addProfile(student_2);
		database.addProfile(student_3);
		
		//Add the instructor profile
		database.addProfile(instructor_1);
		database.addProfile(instructor_2);
		database.addProfile(instructor_3);
		
		System.out.println("[AVERAGE GRADE]");
		System.out.println("Average grade for the student " + student_1.getFirstName() + " is " +  df.format(student_1.calculateAverage()) + ".\n");
		System.out.println("Average grade for the student " + student_3.getFirstName() + " is " + df.format(student_3.calculateAverage()) + ".\n");
	
		//Displays details from database
		database.displayDetails();
	
		/**
		 * Validating some negative scenarios
		 */
		System.out.println("[ERROS]\n");
		
		System.out.println("[Case1]: Name, email and ID empty");
		Student student_4 = new Student(null, "", "", "");
		
		System.out.println("[Case2]: Invalid grade");
		student_4.addCourse(" ", -94.03);
		database.addProfile(student_4);
		
		System.out.println("[Case3]: Invalid hourly wage");
		Instructor instructor_4 = new Instructor("Angel", "Chan", "angel@gmail.com", "IN0045893",-1);
		database.addProfile(instructor_4);
	}

}
