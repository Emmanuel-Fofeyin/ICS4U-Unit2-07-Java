/*
* This is the Truck class.
*
* @author  Emmanuel FN
* @version 1.0
* @since   2024-04-21
*/

/**
* This is the Truck class.
*/
public class Truck extends Vehicle {
    /**
    * The licensePlateNumber of the truck.
    */
    private String licensePlateNumber;

    /**
     * Constructor to initialize a truck.
     *
     * @param color             The color of the truck.
     * @param maxSpeed          The maximum speed of the truck.
     * @param licensePlateNumber The license plate number of the truck.
     */
    public Truck(String color, int maxSpeed, String licensePlateNumber) {
        super(color, maxSpeed);
        this.licensePlateNumber = licensePlateNumber;
    }

    /**
     * Gets the license plate number of the truck.
     *
     * @return The license plate number of the truck.
     */
    public String getLicensePlateNumber() {
        return licensePlateNumber;
    }

    /**
     * Sets the license plate number of the truck.
     *
     * @param licensePlateNumber The license plate number to set.
     */
    public void setLicensePlateNumber(String licensePlateNumber) {
        this.licensePlateNumber = licensePlateNumber;
    }

    /**
     * The status method.
     */
    public void status() {
        super.status();
        System.out.println(" -> License Plate: " + licensePlateNumber);
    }

    /**
     * The applyAir method.
     *
     * @param airPressure The air pressure to apply.
     */
    public void applyAir(int airPressure) {
        speed = speed - airPressure / 2;
    }
}
