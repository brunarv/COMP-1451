/**
 * COMP 1451 - Assignment 01 * 
 * @author (Bruna Ramos Vieira - A00985171)
 * @version (08 May 2017)
 *
*/
import java.util.HashMap;

public class Bank {
		
	/**
	 * The bank collection to hold all Bank Customer data.
	 * Uses a customer's account number as key and the BankCustomer reference as the value.
	 */
	public static HashMap<String, BankCustomer> theBank;

	/**
	 * Default constructor for Bank class.
	 * Initializes the HashMap
	 */
	public Bank() {
		super();
		theBank = new HashMap<String, BankCustomer>();
	}

	/**
	 * Add a new BankCustomer element to the HashMap.
	 * @param newCustomer 
	 * 			The new element to add to the HashpMap using the account 
	 * 			number as the key and the new BankCustomer as the value.
	 */
	public void createAccount(BankCustomer newCustomer) {

		if (newCustomer != null) {
			theBank.put(newCustomer.getAccountNumber(), newCustomer);
		}
	}

	/**
	 * Removes an BankCustomer from the HashMap.
	 * @param accountNumber 
	 * 			The key of the element to remove from the HashMap.
	 */
	public void closeAccount(String accountNumber) {

		if (accountNumber != null) {

			BankCustomer customer = theBank.get(accountNumber);
			//scustomer.setActive(false);
			theBank.remove(customer);
			
		}
	}

	/**
	 * Gets the BankCustomer from the HashMap and adds a double amount 
	 * to a BankCustomer's balance.
	 * @param accountNumber 
	 * 		The account number of the BankCustomer.
	 * @param amount 
	 * 		The amount to deposit.
	 */
	public void deposit(String accountNumber, double amount) {

		if (accountNumber != null) {
			BankCustomer customer = theBank.get(accountNumber);
			customer.addToBalance(amount);
		}

	}
	
	/**
	 * Gets the BankCustomer from the HashMap and subtracts an amount 
	 * from a BankCustomer's balance as long as it does not leave a negative balance. 
	 * @param accountNumber 
	 * 			The account number of the BankCustomer.
	 * @param amount 
	 * 			The amount to subtract from a BankCustomer's balance.
	 */
	public void withdraw(String accountNumber, double amount) {
		
		if (accountNumber != null) {
			BankCustomer customer = theBank.get(accountNumber);
			customer.subtractFromBalance(amount);
		}
		
	}
	
	/**
	 * Displays the details of a BankCustomer element in the HshMap.
	 * Uses BankCustomer.toString() implementation.
	 * @param customer the BankCustomer chosen to display.
	 */
	public void displayCustomerInformation(BankCustomer customer){
		
		if(customer != null){
			
			System.out.println(customer);
		}
	}
	
	/**
	 * Displays all elements of the HashMap by using BankCustomer.toString() 
	 * implementation of each.
	 */
	public void displayAllCustomers(){
		
		for(BankCustomer customer : theBank.values()){
			
			System.out.println(customer);
			
		}
	}

}
