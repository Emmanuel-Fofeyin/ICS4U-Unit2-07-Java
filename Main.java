/*
* This is the main code that runs with the Vehicle Class.
*
* @author  Emmanuel FN
* @version 1.0
* @since   2024-04-21
*/

/**
* This is the Main class.
*/
final class Main {
    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException if instantiation is attempted
    */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(String[] args) {
        // Constants for magic numbers
        final int tenNumber = 10;
        final int fortyNumber = 40;
        final int fifteenNumber = 15;
        final int twoHundredNumber = 200;
        final String newSpeedSting = "New speed: ";

        final Bike bmx = new Bike("Red", fortyNumber);

        System.out.println("Created Bmx bike.\nStatus:\n");
        bmx.status();

        System.out.println("Set the cadence to 10\n");
        bmx.setCadence(tenNumber);
        bmx.status();

        System.out.println("\nAccelerate by 15:");
        bmx.accelerate(fifteenNumber);
        bmx.status();

        System.out.println("\nRing bell.");
        bmx.ringBell();

        final Truck bigTruck = new Truck("Grey", twoHundredNumber, "HGC-3456F");

        System.out.println("Created a Truck.\nStatus:\n");
        bigTruck.status();

        System.out.println("\nAccelerating, 10 of power for ten seconds:");
        bigTruck.accelerate(tenNumber, tenNumber);
        System.out.println(newSpeedSting + bigTruck.getSpeed());

        System.out.println("\nBreaking, 10 of power for 10 sec.");
        bigTruck.accelerate(tenNumber, tenNumber);
        System.out.println(newSpeedSting + bigTruck.getSpeed());

        System.out.println("\nApplied air pressure of 10:");
        bigTruck.applyAir(tenNumber);
        System.out.println(newSpeedSting + bigTruck.getSpeed());

        System.out.println("\nDone.");
    }
}
