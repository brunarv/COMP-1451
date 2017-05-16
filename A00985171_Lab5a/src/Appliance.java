/**
 * 
 */

/**
 * @author bruna
 *
 */
public class Appliance
{
    private String brand;
    private String serialNumber;
    private int interiorHeightCm;
    private int interiorDepthCm;
    private int interiorWidthCm;

    /**
     * Default constructor for objects of class Appliance
     */
    public Appliance()
    {
        
    }

    /**
     * Constructor
     * @param brand
     * @param serialNumber
     * @param interiorHeightCm
     * @param interiorDepthCm
     * @param interiorWidthCm
     */
    public Appliance(String brand, String serialNumber, int interiorHeightCm, int interiorDepthCm, int interiorWidthCm )
    {
        setBrand(brand);
        setSerialNumber(serialNumber);
        setInteriorHeightCm(interiorHeightCm);
        setInteriorDepthCm(interiorDepthCm);
        setInteriorWidthCm(interiorWidthCm);    
    }
    
    /**
     * Sets the brand
     * @param brand
     */
    public void setBrand(String brand)
    {
        if (brand != null  && brand.length() > 0) {
            this.brand = brand;
        }
        else{
        	System.out.println("Please, provide a valid brand name.");
        }
    }
    
    /**
     * Gets the brand
     * @return brand
     */
    public String getBrand()
    {
        return brand;
    }
    
    /**
     * Sets the serial number
     * @param serialNumber
     */
    public void setSerialNumber(String serialNumber)
    {
        if (serialNumber != null  && serialNumber.length() > 0) {
            this.serialNumber = serialNumber;
        }
        else{
        	System.out.println("Please, provide a valid serial number.");
        }
    }
        
    /**
     * Gets the serial number
     * @return serial number
     */
    public String getSerialNumber()
    {
        return serialNumber;
    }
    
    /**
     * Sets interior height in Cm
     * @param interiorHeightCm
     */
    public void setInteriorHeightCm(int interiorHeightCm)
    {
        if(interiorHeightCm > 0){
            this.interiorHeightCm = interiorHeightCm;
        }
        else{
        	System.out.println("Please, provide an valid interior height in cm.");
        }
    }
    
    /**
     * Gets interior height in Cm
     * @return interior height cm
     */
    public int getInteriorHeightCm()
    {
        return interiorHeightCm;
    }

    /**
     * Sets interior depth in Cm
     * @param interiorDepthCm
     */
    public void setInteriorDepthCm(int interiorDepthCm)
    {
        if(interiorDepthCm > 0){
            this.interiorDepthCm = interiorDepthCm;
        }
        else{
        	System.out.println("Please, provide an valid interior depth in cm.");
        }
    }
    
    /**
     * Gets interior depth in Cm
     * @return interior depth cm
     */
    public int getInteriorDepthCm()
    {
        return interiorDepthCm;
    }
    
    /**
     * Sets interior width in Cm
     * @param interiorWidthCm
     */
    public void setInteriorWidthCm(int interiorWidthCm)
    {
        if(interiorWidthCm > 0){
            this.interiorWidthCm = interiorWidthCm;
        }
        else{
        	System.out.println("Please, provide an valid interior width in cm.");
        }
 
    }
    
    /**
     * Gets interior width in Cm
     * @return interior width cm
     */
    public int getInteriorWidthCm()
    {
        return interiorWidthCm;
    }


}