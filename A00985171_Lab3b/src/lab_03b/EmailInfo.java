/**
 * COMP 1451 - Lab03b * 
 * @author (Bruna Ramos Vieira - A00985171)
 * @version (30 April 2017)
 *
*/

package lab_03b;

import java.util.HashMap;

public class EmailInfo {

	private HashMap<String, String> addressBook;

	/**
	 * The default constructor initialize the HashMap that is used to store the address book
	 */
	public EmailInfo() {
		addressBook = new HashMap<String, String>();
	}

	/**
	 * @return the properly-formatted name (First letter upper case and the rest lower case)
	 * @param name is used to pass in the name to be formated.
	 */
	private String formatName(String name) {
		String formattedName = "";
		if (name != null && !name.isEmpty()) {
			formattedName = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
		}
		return formattedName;
	}

	/**
	 * Add a friend to the address book. The friend's name must be formatted
	 * before being stored.
	 * 
	 * @param name uses it as the key for the provided email address
	 * @param email uses it as the value for the name
	 */
	public void addFriend(String name, String email) {
		if (name != null && !name.isEmpty()) {
			if (email != null && !email.isEmpty()) {
				name = formatName(name);  
				addressBook.put(formatName(name), email.toLowerCase());
			} 
		} 
	}

	/**
	 * Remove a friend from the address book. The name passed it can be in upper
	 * case, lower case, or mixed. The friend and his/her email will be removed
	 * from the address book.
	 * 
	 * @param name used to remove that was passed as parameter.
	 */

	public void removeFriend(String name) {
		if (name != null && !name.isEmpty()) {
			name = formatName(name);
			addressBook.remove(name);
			System.out.println("RESULT: The friend" + " " + name + " " + " was removed from the address book \n");
		}
	}

	/**
	 * Return an email address based on friend’s name. The name passed in can be
	 * in upper case, lower case, or mixed. The friend's email address will be
	 * returned.
	 * 
	 * @param name used to find the email address based on friend’s name
	 * @return the email address of the friend passed as parameter.
	 * 
	 */

	public String getAddress(String name) {
		name = formatName(name);
		return addressBook.get(name);
	}

	/**
	 * Find and display friends based on their email address. There might be more
	 * than one friend using the same email.
	 * 
	 * @param email used to find the name of friend  
	 */
	public void findFriends(String email) {
		if (email != null && !email.isEmpty()) {
			email = email.toLowerCase();
			if (addressBook.containsValue(email)) {
				for (String name : addressBook.keySet()) {
					if (addressBook.get(name).equals(email)) {
						System.out.println("\nRESULT: " + name);
					}
				}
			} 
		} 
	}

	/**
	 * List all friends and their email addresses 
	 * 
	 */
	public void listAll() {
		if (!this.addressBook.isEmpty()) {
			System.out.println("[CONTACT LIST]\n");
			for (String name : addressBook.keySet()) {
				System.out.println("Name:" + name + "\n" + "E-mail:" + addressBook.get(name) + "\n");
			}
		} 
	}
}
