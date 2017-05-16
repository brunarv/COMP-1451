
/**
 * @author bruna
 *
 */
public class Refrigerator extends Appliance
{
    private int maxColdCentigrade;

    /**
     * Default constructor for objects of class Refrigerator
     */
    public Refrigerator()
    {
        super();
        
    }

    /**
     * Constructor
     * @param brand
     * @param serialNumber
     * @param interiorHeightCm
     * @param interiorDepthCm
     * @param interiorWidthCm
     * @param maxColdInCentigrade
     */
    public Refrigerator(String brand,String serialNo, int interiorHeightCm, int interiorDepthCm, int interiorWidthCm, int maxColdCentigrade)
    {
        super(brand, serialNo, interiorHeightCm, interiorDepthCm, interiorWidthCm);
        setMaxColdCentigrade(maxColdCentigrade);
    }
    
    /**
     * Sets max cold in degrees centigrade
     * @param maxColdInCentigrade
     */
    public void setMaxColdCentigrade(int maxColdCentigrade)
    {
        this.maxColdCentigrade = maxColdCentigrade;
    }
    
    /**
     * Gets max cold in degrees centigrade
     * @return max cold in centigrade
     */
    public int getMaxColdCentigrade()
    {
        return maxColdCentigrade;
    }
    
    /**
     * Calculates capacity in cubic Cm
     * @return capacity
     */
    public double calculateCapacityCubicCm()
    {
        double height = getInteriorHeightCm();
        double depth = getInteriorDepthCm();
        double width =  getInteriorWidthCm();
        
        double total =  height * depth * width;
        
    	return total;
    }
}
