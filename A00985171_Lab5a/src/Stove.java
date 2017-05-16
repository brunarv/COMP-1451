/**
 * 
 */

/**
 * @author bruna
 *
 */
public class Stove extends Appliance
{
    private int numberHeatingElements;

    /**
     * Default constructor for objects of class Stove
     */
    public Stove()
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
     * @param numberHeatingElements
     */
    public Stove(String brand,String serialNumber, int interiorHeightCm, int interiorDepthCm, int interiorWidthCm, int maxColdCentigrade)
    {
        super(brand, serialNumber, interiorHeightCm, interiorDepthCm, interiorWidthCm);
        setNumberHeatingElements(numberHeatingElements);
    }
    
    /**
     * Sets number of heating elements
     * @param numberHeatingElements
     */
    public void setNumberHeatingElements(int numberHeatingElements)
    {
        if(numberHeatingElements > 0){
            this.numberHeatingElements = numberHeatingElements;
        }
    }
    
}
