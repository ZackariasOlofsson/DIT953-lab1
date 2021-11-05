import java.awt.*;

public class NyVolvo extends Car {

    // klassvariabel
    private final static double trimFactor = 1.25;

    // konstruktor
    public NyVolvo(){
        super(4, 100, Color.black, "Volvo240");
    }

    public NyVolvo(int nrDoors, int enginePower, Color color, String modelName) {
        super(nrDoors, enginePower, color, modelName);
    }

    // metoder
    public double speedFactor(){
        return getEnginePower() * 0.01 * trimFactor;
    }
}
