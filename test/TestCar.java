import org.junit.Before;
import org.junit.Test;

import java.awt.*;

public class TestCar {
    private NyVolvo car;

    @Before
    public void init(){
        car = new NyVolvo();
    }

    @Test
    public void testGetNrDoors(){
        assert(4 == car.getNrDoors());
    }

    @Test
    public void testGetColor(){
        assert(Color.black == car.getColor());
    }

    @Test
    public void testGetEnginePower(){

    }
}
