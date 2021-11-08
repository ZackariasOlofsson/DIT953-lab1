import java.awt.*;

/**
 * Subklass för Saab95
 */
public class Saab95 extends Car{

    /**
     * Variabler
     */
    private boolean turboOn = false;

    /**
     * Konstruktor för Saab95
     */
    public Saab95(){
        super(2,125, Color.red, "saab123");
    }

    /**
     * @param nrDoors Number of doors on the car.
     * @param enginePower The engine power of the car.
     * @param color The color of the car.
     * @param modelName The model of the car.
     */
    public Saab95(int nrDoors, int enginePower, Color color, String modelName) {
        super(nrDoors, enginePower, color, modelName);
    }

    /**
     * Starta turbo
     */
    public void setTurboOn(){
        turboOn = true;
    }

    /**
     * Stäng av turbo
     */
    public void setTurboOff(){
        turboOn = false;
    }

    public double speedFactor() {
        return getEnginePower() * 0.01 * (turboOn ? 1.3 : 1);
    }
}
