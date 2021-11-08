import org.junit.Test;

public class TestVolvo {
    NyVolvo volvo = new NyVolvo();

    @Test
    public void TestSpeedFactor(){
        double speedFactor = volvo.speedFactor();
        assert (speedFactor == volvo.getEnginePower()*0.01*1.25);
    }

}
