
/**
 * @author bruna 
 * @version 
 */
public class Driver {

	
	/**
	 * Test the program's primary functions.
	 * @param args possible String arguments provided at program execution.
	 */
	public static void main(String[] args) {
		
		
		System.out.println("********************************************");
		System.out.println("*               TEST CASES                 *");
		System.out.println("********************************************");
		System.out.println("* TC 1. Add 5 members                      *");
		System.out.println("* TC 2. Display all members                *");
		System.out.println("* TC 3. Display all members joined in 2011 *");
		System.out.println("* TC 4. Remove all members joined in 2011  *");
		System.out.println("* TC 5. Display all member after removing  *");
		System.out.println("* TC 6. Add a new member                   *");
		System.out.println("* TC 7. Display all members                *");
		System.out.println("* TC 8. Try to remove a member adding a    *");
		System.out.println("*       year higher then the current year  *");
		System.out.println("********************************************");
		//TC 01 - add 5 members
		System.out.println("--------------------");
		System.out.println("[TC 1] ADD 6 Members");
		System.out.println("--------------------");
		
		
		Member member = new Member();
		
		Club club = new Club();
	
		member = new Member("Chrystian", "Vieira", 1, 2006);
		club.join(member);
		
		member = new Member("Maria", "Ramos", 4, 2011);
		club.join(member);
		
		member = new Member("Creuza", "Oliveira", 5, 2011);
		club.join(member);
		
		
		member = new Member("Elder", "Peixoto", 12, 2013);
		club.join(member);
		
		member = new Member("Gui", "Cruz", 3, 2015);
		club.join(member);
		
		member = new Member("Bruna", "Vieira", 10, 2016);
		club.join(member);
		
	
		
		// TC 2 - display all members
		System.out.println("-------------------------");
		System.out.println("[TC 2] DISPLAYING Members");
		System.out.println("-------------------------");
		club.showMembers();
		System.out.println("Member count: " + club.numberOfMembers());
		
		//TC 03 - display all members joined in 2011
		System.out.println("------------------------------");	
		System.out.println("[TC 3] DISPLAYING 2011 Members");
		System.out.println("------------------------------");
		club.showMembersByYear(2011);
		
		//TC 04 - remove all members joined in 2011
		System.out.println("----------------------------");
		System.out.println("[TC 4] REMOVING 2011 Members");
		System.out.println("----------------------------");
		club.removeMembersByYear(2011);
		
		//TC 05 - display all after removing
		System.out.println("-------------------------");
		System.out.println("[TC 5] DISPLAYING Members");
		System.out.println("-------------------------");
		club.showMembers();
		System.out.println("Member count: " + club.numberOfMembers());
		
		//TC 06 - add a new member
		System.out.println("-----------------------");
		System.out.println("[TC 6] ADD a new Member");
		System.out.println("-----------------------");
		club.join(new Member("Jandira", "Vieira", 6, 2014));
		
		//TC 07 - display all members after adding	
		System.out.println("-------------------------");
		System.out.println("[TC 7] DISPLAYING Members");
		System.out.println("-------------------------");
		club.showMembers();
		System.out.println("Member count: " + club.numberOfMembers());

		
		//TC 08 - Try to remove a member adding a year higher then the current year
		System.out.println("----------------------------");
		System.out.println("[TC 8] REMOVING 2018 Members");
		System.out.println("----------------------------");
		club.removeMembersByYear(2018);
	}

}
