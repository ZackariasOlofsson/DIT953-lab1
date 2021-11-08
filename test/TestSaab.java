import org.junit.Before;
import org.junit.Test;

public class TestSaab {
    private NySaab saab;

    @Before
    public void setup(){
        saab = new NySaab();
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

    }
}
