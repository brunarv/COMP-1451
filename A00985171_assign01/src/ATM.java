/**
 * COMP 1451 - Assignment 01 * 
 * @author (Bruna Ramos Vieira - A00985171)
 * @version (08 May 2017)
 *
*/
public class ATM {


	private InputReader reader;
	private String accountNumber;
	private String passcode;
	private boolean customerVerified;

	private Bank theBank;
	private BankCustomer currentCustomer;
	

	/**
	 * Default constructor. Calls the initialize() method to seed the Bank with
	 * some BankCustomers. Calls the run() method to perform the primary program
	 * functions.
	 */
	public ATM() {
		super();
		initialize();
		run();
	}

	/**
	 * Main method calls the class default constructor.
	 * @param args for program arguments (not used)
	 */
	public static void main(String[] args) {

		new ATM();

	}

	/**
	 * The primary application processor. All application functions are called
	 * from here. Uses a loop to prompt users to perform banking transactions. 
	 * Must use switch/case selection to determine uses choices.
	 */
	public void run() {

		reader = new InputReader();
		boolean exit = false;

		System.out.println("Welcome to Bullwinkle's Bank.");

		while (!exit) {
			System.out.println("Choose one of the following options:");
			System.out.println("1 - Sign In");
			System.out.println("2 - Deposit");
			System.out.println("3 - Withdraw");
			System.out.println("4 - Display Account Info");
			System.out.println("5 - Exit");
			System.out.print("> ");
			
			int choice = reader.getIntInput();

			switch (choice) {

			case 1:
				choice = 1;
				verifyCustomer();
				break;
			case 2:
				choice = 2;
				transactDeposit();
				break;
			case 3:
				choice = 3;
				transactWithdraw();
				break;
			case 4:
				choice = 4;
				displayAccountInformation();
				break;
			case 5:
				choice = 5;
				System.out.println("\nThank you for banking at Bullwinkle's Bank");
				System.out.println("DEBUG: Displaying all the accounts in the bank.\n");
				theBank.displayAllCustomers();
				System.exit(0);

			}

		}

	}

	/**
	 * Adds Customer references to the Back HashMap as seed data for testing.
	 */
	public void initialize() {

		theBank = new Bank();
		theBank.createAccount(new BankCustomer("Bruna", "Vieira", "AC001", "123"));
		theBank.createAccount(new BankCustomer("Guilherme", "Cruz", "AC002", "456"));
		theBank.createAccount(new BankCustomer("Chrystian", "Vieira", "AC003", "789"));

	}
	
	/**
	 * Displays a BankCustomer's account information if the customer has been
	 * previously verified.
	 */
	public void displayAccountInformation() {

		if (customerVerified) {
			System.out.println("Here is your information.");
			theBank.displayCustomerInformation(currentCustomer);
		} else {

			System.out.println("ERROR: You must LOGIN before you can perform a transaction.\n");
			verifyCustomer();
		}

	}
	

	/**
	 * Performs a deposit into a BankCustomer's account. Checks to see if the
	 * user has signed in. If not, then verifyCustomer() is called and the menu
	 * is displayed again.
	 */
	public void transactDeposit() {

		if (customerVerified) {
			System.out.println("Enter the amount to deposit: ");
			currentCustomer.addToBalance(reader.getDoubleInput());

		} else {

			System.out
					.println("ERROR: You must LOGIN before you can perform a transaction.\n");
			verifyCustomer();
		}
	}

	/**
	 * Performs a withdrawal from a BankCustomer's account. Checks to see if the
	 * user has signed in. If not, then verifyCustomer() is called and the menu
	 * is displayed again.
	 */
	public void transactWithdraw() {

		if (customerVerified) {
			System.out.println("Enter the amount to withdraw: ");
			double amount = reader.getDoubleInput();
			if (amount <= currentCustomer.getBalance()) {
				currentCustomer.subtractFromBalance(amount);
			} else {
				System.out.println("ERROR: You have insufficinet funds to withdraw that amount.\n");
			}
		} else {

			System.out.println("ERROR: You must LOGIN before you can perform a transaction.\n");
			verifyCustomer();
		}

	}



	/**
	 * To confirm a BankCustomer's account number and passcode. Called when the
	 * user is required to sign in to the application. Will set a boolean so the
	 * user does not have to sign in again during the session.
	 */
	public void verifyCustomer() {

		System.out.println("Enter Account Number: ");
		accountNumber = reader.getStringInput();
		System.out.println("Enter Passcode: ");
		passcode = reader.getStringInput();

		currentCustomer = Bank.theBank.get(accountNumber);

		if (currentCustomer != null) {
			if (passcode.equals(currentCustomer.getPasscode())) {
				customerVerified = true;
			} else{ 
				//If passcode is incorrect
				System.out.println("ERROR: Either account number or passcode is not correct.\n");
				run();
			}

		} else {
			// If customer is invalid
			System.out.println("ERROR: Either account number or passcode is not correct.\n");
			run();
		}

	}
}
