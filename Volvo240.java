import java.awt.*;

public class Volvo240 extends Car {

    // klassvariabel
    private final static double trimFactor = 1.25;

    // konstruktor
    public Volvo240(){
        super(4, 100, Color.black, "Volvo240");
    }

    public Volvo240(int nrDoors, int enginePower, Color color, String modelName) {
        super(nrDoors, enginePower, color, modelName);
    }

    // metoder
    public double speedFactor(){
        return getEnginePower() * 0.01 * trimFactor;
    }
}
