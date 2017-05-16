public class Driver {

	/**
	 * @param args
	 */
		public static void main(String[] args) {
			
			ApplianceStore store = new ApplianceStore();
			
			//DEFAULT SCENARIOS 
			System.out.print(" [DEFAULT SCENARIOS - every values are valid]");
			
			//add Refrigerators
			Refrigerator refrigerator_01 = new Refrigerator("refrigerator_A", "A001", 12, 13, 14, 16);
			Refrigerator refrigerator_02 = new Refrigerator("refrigerator_B", "B001", 12, 23, 14, 16);
			Refrigerator refrigerator_03 = new Refrigerator("refrigerator_C", "C001", 12, 13, 25, 16);
			
			//Add Stoves
			Stove stove_04 = new Stove("stove_D", "D001", 12, 13, 14, 16);
			Stove stove_05 = new Stove("stove_E", "E001", 12, 13, 14, 16);
			Stove stove_06 = new Stove("stove_F", "F001", 12, 13, 14, 16);
										
			//Add the appliances to the store
			store.addAppliance(refrigerator_01);
			store.addAppliance(refrigerator_02);
			store.addAppliance(refrigerator_03);
			store.addAppliance(stove_04);
			store.addAppliance(stove_05);
			store.addAppliance(stove_06);
			
			//Display the count of appliances			
	    	System.out.println("\n\n---------------------------------");
	        System.out.println("Count of appliances in this store");
	        System.out.println("---------------------------------");				
			System.out.println("Total " + store.countAppliances() + "\n");
			
			//Display all appliances on the store
			store.displayInfo();
			
			//Display the capacity in cubic Cm of refrigerator
			System.out.println("\n---------------------------------");
			System.out.println("Calculates capacity in cubic Cm");
			System.out.println("---------------------------------");
			System.out.println("Refrigerator 01: " + refrigerator_01.calculateCapacityCubicCm() + "cm");
			System.out.println("Refrigerator 02: " + refrigerator_02.calculateCapacityCubicCm() + "cm");
			System.out.println("Refrigerator 03: " + refrigerator_03.calculateCapacityCubicCm() + "cm");
					
			//NEGATIVE SCENARIOS 
			System.out.print("\n[INVALID SCENARIOS] \n"); 

			System.out.println("\n[CASE 01] All fields are null, empty or zero");
			Refrigerator refrigerator_07 = new Refrigerator(null, "", 0, 0, 0, 0);
			store.addAppliance(refrigerator_07);
			
			System.out.println("\n[CASE 02] Negative values for height, depth and width");
			Refrigerator refrigerator_08 = new Refrigerator("refrigerator_H", "H001" ,-12, -13, -14, -16);			
			store.addAppliance(refrigerator_08);

		}
}
