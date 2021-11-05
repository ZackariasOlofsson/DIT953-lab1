import java.awt.*;

public class NySaab extends Car{

    // instansvariabler
    private boolean turboOn = false;

    //konstruktor
    public NySaab(){
        super(2,125, Color.red, "saab123");
    }

    public NySaab(int nrDoors, int enginePower, Color color, String modelName) {
        super(nrDoors, enginePower, color, modelName);
    }

    // metoder
    public void setTurboOn(){
        turboOn = true;
    }

    public void setTurboOff(){
        turboOn = false;
    }

    public double speedFactor() {
        return getEnginePower() * 0.01 * (turboOn ? 1.3 : 1);
    }
}
