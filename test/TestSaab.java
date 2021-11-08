import org.junit.Before;
import org.junit.Test;

import java.awt.*;

public class TestSaab {
    private Saab95 saab;

    @Before
    public void setup(){
        saab = new Saab95();
    }

    @Test
    public void testDefaultSpeedFactor(){
        assert saab.speedFactor() == saab.getEnginePower()*0.01;
    }

    @Test
    public void testTurboOnSpeedFactor(){
        saab.setTurboOn();
        assert saab.speedFactor() == saab.getEnginePower()*0.01*1.3;
    }

    @Test
    public void testTurboOffSpeedFactor() {
        saab.setTurboOn();
        assert saab.speedFactor() == saab.getEnginePower()*0.01*1.3;
        saab.setTurboOff();
        assert saab.speedFactor() == saab.getEnginePower()*0.01;
    }

    @Test
    public void testCustomSaab() {
        int doors = 5;
        int enginePower = 420;
        Color c = Color.black;
        String model = "SaabSpeed";

        Saab95 cSaab = new Saab95(doors, enginePower, c, model);

        assert cSaab.getNrDoors() == doors;
        assert cSaab.getColor().equals(c);
        assert cSaab.getEnginePower() == enginePower;
        assert cSaab.getModelName().equals(model);

    }
}
