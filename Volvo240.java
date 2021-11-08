import java.awt.*;

/**
 * Subclass for Volvo240
 */
public class Volvo240 extends Car {

    /**
     * Variables
     */
    private final static double trimFactor = 1.25;
    private final static double engineFactor = 0.01;


    /**
     * Default constructor
     */
    public Volvo240(){
        super(4, 100, Color.black, "Volvo240");
    }

    /**
     * Constructor for specific properties
     * @param nrDoors Number of doors on the car.
     * @param enginePower The engine power of the car.
     * @param color The color of the car.
     * @param modelName The model of the car.
     */
    public Volvo240(int nrDoors, int enginePower, Color color, String modelName) {
        super(nrDoors, enginePower, color, modelName);
    }

    /**
     * A method calculating the speed factor as a product of the engine power, engine factor and trim factor.
     * @return The speed factor.
     */
    public double speedFactor(){
        return getEnginePower() * engineFactor * trimFactor;
    }
}
