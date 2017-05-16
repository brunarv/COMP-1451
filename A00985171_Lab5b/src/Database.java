
/**
 * @author Bruna Ramos Vieira A00985171
 * COMP 1451 - Lab5b
 */

import java.util.ArrayList;

public class Database {
	private ArrayList<Profile> profiles;

	/**
	 * Constructor utilizing the ArrayList.
	 */
	public Database() {
		profiles = new ArrayList<Profile>();
	}

	/**
	 * Method to add new profiles to the ArrayList (Database).
	 * 
	 * @param profile is the new detailed profile added.
	 */
	public void addProfile(Profile profile) {
		if (profile != null) {
			profiles.add(profile);
		}
	}

	/**
	 * Method to display all the profiles (both students and instructor) in the ArrayList (Database), s.
	 */
	public void displayDetails() {
		if (!profiles.isEmpty() && profiles != null) {
			System.out.println("[DATABASE]");
			for (Profile profile : profiles) {
				profile.displayDetails();
			}
		}
	}
}
