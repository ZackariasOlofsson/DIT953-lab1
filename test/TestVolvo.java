import org.junit.Before;
import org.junit.Test;

import java.awt.*;

public class TestVolvo {
    Volvo240 volvo;

    @Before
    public void setup(){
        volvo = new Volvo240();
    }

    @Test
    public void TestSpeedFactor(){
        double speedFactor = volvo.speedFactor();
        assert (speedFactor == volvo.getEnginePower()*0.01*1.25);
    }

    @Test
    public void TestAnnanVolvo(){
        Volvo240 annanVolvo = new Volvo240(6, 150, Color.red, "VolvoStor");

        assert(annanVolvo.getNrDoors()==6);
        assert(annanVolvo.getEnginePower()==150);
        assert(annanVolvo.getColor()==Color.red);
        assert(annanVolvo.getModelName().equals("VolvoStor"));
    }
}
