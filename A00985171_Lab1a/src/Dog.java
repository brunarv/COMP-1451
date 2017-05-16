/**
 * Dog class to hold information about a dog
 */

/**
 * @author bruna
 *
 */
public class Dog {
	
	private String name;
	private String breed;
	private int age;
	

	/**
	 * Defatult constructor to create default Dog objects.
	 * @param name to set the name field
	 * @param breed to set the breed field
	 * @param age to set the age field
	 */
	public Dog(String name, String breed, int age) {
		super();
		this.name = name;
		this.breed = breed;
		this.age = age;
	}


	/**
	 * @return the name as a String
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the breed as a String
	 */
	public String getBreed() {
		return breed;
	}


	/**
	 * @param breed the breed to set
	 */
	public void setBreed(String breed) {
		this.breed = breed;
	}


	/**
	 * @return the age  as an int
	 */
	public int getAge() {
		return age;
	}


	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}	

}
