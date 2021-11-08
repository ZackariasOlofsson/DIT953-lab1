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

    @Test
    public void testGas() {
        double gasAmount = 0.3;
        car.startEngine();
        double speedEnergy = car.getCurrentSpeed();
        car.gas(gasAmount);

        assert car.getCurrentSpeed() == Math.min(speedEnergy + car.speedFactor()*gasAmount, car.getEnginePower());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidGas() {
        double gasAmount = -0.1;
        car.gas(gasAmount);
    }

    @Test
    public void testTurnLeft(){
        car.turnLeft();
        assert(car.getDirection()==3);
        car.turnLeft();
        assert(car.getDirection()==2);
        car.turnLeft();
        assert(car.getDirection()==1);
        car.turnLeft();
        assert(car.getDirection()==0);
    }

    @Test
    public void testTurnRight(){
        car.turnRight();
        assert(car.getDirection()==1);
        car.turnRight();
        assert(car.getDirection()==2);
        car.turnRight();
        assert(car.getDirection()==3);
        car.turnRight();
        assert(car.getDirection()==0);
    }

}

