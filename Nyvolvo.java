import java.awt.*;

public class Nyvolvo extends Car{

    // klassvariabel
    private final static double trimFactor = 1.25;

    // konstruktor
    public Nyvolvo(){
        super(4, 100, Color.black, "volvo123");
    }

    // metoder
    @Override
    public double speedfactor(){
        return getEnginePower() * 0.01 * trimFactor;
    }
}
