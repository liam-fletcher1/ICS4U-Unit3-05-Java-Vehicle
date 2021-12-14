/*
 * The Vehicle Program
 *
 * @author  Liam Fletcher
 * @version 1.0
 * @since   2021-12-13
 */


public class Vehicle {

    private String licensePlate;
    private String colour;
    private final int numOfDoors;
    private final int maxSpeed;
    private int speed;

    /**
     * @param licensePlate 
     * @param colour 
     * @param numOfDoors
     * @param maxSpeed
     * */
    public Vehicle(final String licensePlate, final String colour,
        final int numOfDoors, final int maxSpeed) {

        this.licensePlate = licensePlate;
        this.colour = colour;
        this.numOfDoors = numOfDoors;
        this.maxSpeed = maxSpeed;
        this.speed = 0;
    }

    /**
     * Gets the license plate.
     *
     * @return the license plate
     * */
    public String getLicensePlate() {
        return this.licensePlate;
    }

    /**
     * Sets the license plate.
     *
     * @param newLicensePlate the new license plate
     * */
    public void setLicensePlate(final String newLicensePlate) {
        this.licensePlate = newLicensePlate;
    }

    /**
     * Gets the car colour.
     *
     * @return the car colour
     * */
    public String getColour() {
        return this.colour;
    }

    /**
     * Sets the car colour.
     *
     * @param newColour the new car colour
     * */
    public void setColour(final String newColour) {
        this.colour = newColour;
    }

    /**
     * Gets the number of doors.
     *
     * @return the number of doors
     * */
    public int getNumOfDoors() {
        return this.numOfDoors;
    }

    /**
     * Gets the max speed.
     *
     * @return the max speed
     * */
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    /**
     * Gets the speed.
     *
     * @return the speed
     * */
    public int getSpeed() {
        return this.speed;
    }

    /**
     * Increases the speed.
     *
     * @param accelerateBy increase the speed by this amount
     * */
    public void accelerate(int accelerateBy) {
        this.speed += accelerateBy;
    }

    /**
     * Decreases the speed.
     *
     * @param brakeBy decrease the speed by this amount
     * */
    public void brake(int brakeBy) {
        this.speed -= brakeBy;
    }
}
