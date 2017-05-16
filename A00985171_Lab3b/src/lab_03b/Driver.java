/**
 * COMP 1451 - Lab03b * 
 * @author (Bruna Ramos Vieira - A00985171)
 * @version (30 April 2017)
 *
*/

package lab_03b;

public class Driver {

	/**
	 * @param args
	 */
		public static void main(String[] args) {
				
			EmailInfo addressBook = new EmailInfo();
			
			String line = "_______________________________________________________________________________";
		
			// Declaring the names of the friends
			String[] names = {"bruna", "gUiLhErme", "CHrySTian", "MariA", "ELDER", "gUiLhErme"};
			
			
			// Adding the friends to the EmailInfo class
			for(String name : names) {
				addressBook.addFriend(name, name + "@gmail.com");
			}
			
			// Duplicated e-mail
			addressBook.addFriend("FernanDo", "gUiLhErme@gmail.com");
			
			
			System.out.println(line);
			
			// Listing all friends and their email addresses
			System.out.print("[TESTE 1] - Listing all friends and their email addresses \n\n");
			addressBook.listAll();
			System.out.println(line);
			
			// Removing a friend from the address book.
			System.out.print("[TESTE 2] - Removing a friend from the address book \n\n");
			addressBook.removeFriend("BRUNA");
			addressBook.listAll();
			System.out.println(line);
			
			// Return an email address based on friend’s name.
			System.out.print("[TESTE 3] - Returning an email address based on friend’s name ('ChRystIan')\n");
			System.out.println("\nRESULT: " + addressBook.getAddress("ChRystIan"));
			System.out.println(line);
			
			// Returning a name based on friend’s address
			System.out.print("[TESTE 4] -  Returning a name based on friend’s address ('guilHERME@gmail.COM') \n");
			addressBook.findFriends("guilHERME@gmail.COM");
			System.out.println(line);
		}
}