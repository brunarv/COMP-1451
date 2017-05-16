import java.util.ArrayList;

/**
 * @author bruna
 *
 */

public class ApplianceStore
{
    private ArrayList<Appliance> appliances;

    /**
     * Constructor for objects of class ApplianceStore
     */
    public ApplianceStore()
    {
        appliances = new ArrayList<Appliance>();
    }
    
    /**
     * Adds appliance to store
     * @param appliance
     */
    public void addAppliance(Appliance appliance)
    {
        if(appliance != null) {
            appliances.add(appliance);
        }
    }
    
    /**
     * Counts appliances.
     * @return count of appliances
     */
    public int countAppliances()
    {   	
        return appliances.size();
    }
    
    /**
     * Displays info about appliances in store.
     */
    public void displayInfo()
    {
    	System.out.println("--------------------------------");
        System.out.println("List of appliances in this store");
        System.out.println("--------------------------------");
        if (appliances.size() > 0 ) {
            for(Appliance eachAppliance : appliances) {
                System.out.println("Brand: " + eachAppliance.getBrand()); 
                System.out.println("Serial Number: " +eachAppliance.getSerialNumber() + "\n");
            }
        }
        else {
            System.out.println("Sorry. There is no appliances in this store!");
        }
    }


}
