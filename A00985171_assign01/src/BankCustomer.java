/**
 * COMP 1451 - Assignment 01 * 
 * @author (Bruna Ramos Vieira - A00985171)
 * @version (08 May 2017)
 *
*/
public class BankCustomer {

	private String firstName;
	private String lastName;
	private String accountNumber;
	private String passcode;
	private double balance;
	

	/**
	 * Default constructor for a BankCustomer. Sets the fields to the default
	 * values for each type.
	 */
	public BankCustomer() {
		super();
	}	

	/**
	 * @param firstName
	 *            String to initialize the firstName field
	 * @param lastName
	 *            String to initialize the lastName field
	 * @param accountNumber
	 *            String to initialize the accountNumber field
	 * @param passcode
	 *            String to initialize the passcode field
	 */
	public BankCustomer(String firstName, String lastName, String accountNumber, String passcode) {
		setFirstName(firstName);
		setLastName(lastName);
		setAccountNumber(accountNumber);
		setPasscode(passcode);
	}

	/**
	 * Accessor method for the firstName field
	 * 
	 * @return the firstName as a String
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Mutator for the firstName field
	 * 
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {

		if (firstName != null && !firstName.trim().isEmpty()) {
			this.firstName = firstName;
		}
	}

	/**
	 * Accessor method for the lastName
	 * 
	 * @return the lastName as a String
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Mutator for the lastName field
	 * 
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {

		if (lastName != null && !lastName.trim().isEmpty()) {
			this.lastName = lastName;
		}
	}

	/**
	 * Accessor method for the accountNumber
	 * 
	 * @return the accountNumber as a String
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * Mutator for the accountNumber field
	 * 
	 * @param accountNumber
	 *            the accountNumber to set
	 */
	public void setAccountNumber(String accountNumber) {

		if (accountNumber != null && !accountNumber.trim().isEmpty()) {
			this.accountNumber = accountNumber;
		}
	}
	
	
	/**
	 * Accessor method for the passcode field
	 * 
	 * @return the passcode as a String
	 */
	public String getPasscode() {
		return passcode;
	}

	/**
	 * Mutator for the passcode field
	 * 
	 * @param passcode
	 *            the passcode to set
	 */
	public void setPasscode(String passcode) {

		if (passcode != null && !passcode.trim().isEmpty()) {
			this.passcode = passcode;
		}
	}

	/**
	 * Accessor method for the balance field
	 * 
	 * @return the balance as a double
	 */
	public double getBalance() {
		return balance;
	}
	
	/**
	 * Mutator for the balance field
	 * 
	 * @param passcode
	 *            the balance to set
	 */

	public void setBalance(double balance) {
		this.balance = balance;
		
	}
		
	/**
	 * Adds to a BankCustomer's balance
	 * 
	 * @param amount
	 *            a double to add to the existing balance field
	 */
	public void addToBalance(double amount) {

		if (amount > 0) {
			setBalance(getBalance() + amount);
		}
	}

	/**
	 * Subtracts from a BankCustomer's balance
	 * 
	 * @param amount
	 *            a double to subtract from the balance field
	 */
	public void subtractFromBalance(double amount) {
		
		if (amount > 0) {
			setBalance(getBalance() - amount);
		}
	}
	/**
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */

	@Override
	public String toString() {
		return "BankCustomer [firstName=" + firstName + ", lastName=" + lastName + ", accountNumber=" + accountNumber
				+ ", passcode=" + passcode + ", balance=" + balance + "]";
	}

}
