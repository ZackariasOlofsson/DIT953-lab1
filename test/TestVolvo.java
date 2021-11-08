import org.junit.Before;
import org.junit.Test;

import java.awt.*;

public class TestVolvo {
    NyVolvo volvo;

    @Before
    public void setup(){
        volvo = new NyVolvo();
    }

    @Test
    public void TestSpeedFactor(){
        double speedFactor = volvo.speedFactor();
        assert (speedFactor == volvo.getEnginePower()*0.01*1.25);
    }

    @Test
    public void TestAnnanVolvo(){
        NyVolvo annanVolvo = new NyVolvo(6, 150, Color.red, "VolvoStor");

        assert(annanVolvo.getNrDoors()==6);
        assert(annanVolvo.getEnginePower()==150);
        assert(annanVolvo.getColor()==Color.red);
        assert(annanVolvo.getModelName().equals("VolvoStor"));
    }
}
