import java.awt.*;

/**
 * Subclass for Saab95
 */
public class Saab95 extends Car{

    /**
     * Variables
     */
    private boolean turboOn = false;
    private final static double turboOnFactor = 1.3;
    private final static double turboOffFactor = 1;
    private final static double engineFactor = 0.01;

    /**
     * Default constructor
     */
    public Saab95(){
        super(2,125, Color.red, "saab123");
    }

    /**
     * Constructor for specific properties
     * @param nrDoors Number of doors on the car.
     * @param enginePower The engine power of the car.
     * @param color The color of the car.
     * @param modelName The model of the car.
     */
    public Saab95(int nrDoors, int enginePower, Color color, String modelName) {
        super(nrDoors, enginePower, color, modelName);
    }

    /**
     * Turn on the turbo
     */
    public void setTurboOn(){
        turboOn = true;
    }

    /**
     * Turn off the turbo
     */
    public void setTurboOff(){
        turboOn = false;
    }

    /**
     * A method calculating the speed factor as a product of the engine power, engine factor and turbo factor.
     * @return The speed factor.
     */
    public double speedFactor() {
        return getEnginePower() * engineFactor * (turboOn ? turboOnFactor : turboOffFactor);
    }
}
