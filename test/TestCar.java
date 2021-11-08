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
        assert(100 == car.getEnginePower());
    }

    @Test
    public void testGetCurrentSpeed(){
        assert(0==car.getCurrentSpeed());
    }

    @Test
    public void testSetCurrentSpeed(){
        car.setCurrentSpeed(5.5);
        assert(5.5==car.getCurrentSpeed());
    }

    @Test
    public void testSetColor(){
        car.setColor(Color.blue);
        assert(Color.blue == car.getColor());
    }

    @Test
    public void testStartEngine(){
        car.startEngine();
        assert(0.1==car.getCurrentSpeed());
    }
}
