import java.awt.*;

public class NySaab extends Car{

    // instansvariabler
    private boolean turboOn;

    //konstruktor
    public NySaab(){
        super(2,125, Color.red, "saab123");
        this.turboOn=false;
    }

    // metoder
    @Override
    public double speedfactor(){
        double turbo = 1;
        if(turboOn){
            turbo = 1.3;
        }
        return getEnginePower() * 0.01 * turbo;
    }
}
