
/**
 * @author Bruna Ramos Vieira A00985171
 * COMP 1451 - Lab5b
 */
public class Instructor extends Profile {
	private double hourlyWage;

	/**
	 * Default constructor.
	 */
	public Instructor() {
	}

	/**
	 * Profile of an instructor.
	 * 
	 * @param firstName of the instructor.
	 * @param lastName of the instructor.
	 * @param email of the instructor.
	 * @param bcitId of the instructor.
	 * @param hourlyWage of the instructor.
	 */
	public Instructor(String firstName, String lastName, String email, String bcitId, double hourlyWage) {
		super(firstName, lastName, email, bcitId);
		setHourlyWage(hourlyWage);
	}

	/**
	 * @return the hourlyWage as a double.
	 */
	public double getHourlyWage() {
		return hourlyWage;
	}

	/**
	 * @param hourlyWage the hourlyWage to set.
	 */
	public void setHourlyWage(double hourlyWage) {
		if (hourlyWage > 0) {
			this.hourlyWage = hourlyWage;
		}else {
				System.out.println("Invalid hourly wage for the instructor " + this.getFirstName() + "\n");
			}
	}

}
