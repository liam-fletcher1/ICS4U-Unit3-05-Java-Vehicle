/*
 * The Vehicle Program
 *
 * @author  Liam Fletcher
 * @version 1.0
 * @since   2021-12-13
 */


class Main {

    /**
     * Prevents instantiation.
     * Throw an exception IllegalStateException 
     *
     * @throws IllegalStateException
     *
     */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * Creates 2 vehicle classes 
     *
     * @param args No args will be used.
     */
    public static void main(final String[] args) {
        Vehicle vehicle1 = new Vehicle("QCLV511", "Brown", 2, 300);
        Vehicle vehicle2 = new Vehicle("OMVV121", "Black", 2, 250);

        vehicle1.setLicensePlate("VNXM159");
        vehicle1.setColour("Grey");
        vehicle1.accelerate(100);

        System.out.println("\nLicense Plate: " + vehicle1.getLicensePlate() +
            "\nColour: " + vehicle1.getColour() +
            "\nNumber of Doors: " + vehicle1.getNumOfDoors() +
            "\nMax Speed: " + vehicle1.getMaxSpeed() +
            "\nCurrent Speed: " + vehicle1.getSpeed());

        vehicle2.setColour("Red");
        vehicle2.accelerate(122);
        vehicle2.brake(90);

        System.out.println("\nLicense Plate: " + vehicle2.getLicensePlate() +
            "\nColour: " + vehicle2.getColour() +
            "\nNumber of Doors: " + vehicle2.getNumOfDoors() +
            "\nMax Speed: " + vehicle2.getMaxSpeed() +
            "\nCurrent Speed: " + vehicle2.getSpeed());
    }
}
