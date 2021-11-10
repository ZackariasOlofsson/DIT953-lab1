import org.junit.Before;
import org.junit.Test;

import java.awt.*;

public class TestCar {
    private Volvo240 car;

    @Before
    public void init() {
        car = new Volvo240();
    }

    @Test
    public void testGetNrDoors() {
        assert (4 == car.getNrDoors());
    }

    @Test
    public void testGetColor() {
        assert (Color.black == car.getColor());
    }

    @Test
    public void testGetEnginePower() {
        assert (100 == car.getEnginePower());
    }

    @Test
    public void testGetCurrentSpeed() {
        assert (0 == car.getCurrentSpeed());
    }


    @Test
    public void testSetColor() {
        car.setColor(Color.blue);
        assert (Color.blue == car.getColor());
    }

    @Test
    public void testStartEngine() {
        car.startEngine();
        assert (0.1 == car.getCurrentSpeed());
    }

    @Test
    public void testGas() {
        double gasAmount = 0.3;
        car.startEngine();
        double speedEnergy = car.getCurrentSpeed();
        car.gas(gasAmount);

        assert car.getCurrentSpeed() == Math.min(speedEnergy + car.speedFactor() * gasAmount, car.getEnginePower());
    }

    @Test
    public void TestGetModelName(){
        String s = "Volvo240";
        assert(s.equals(car.getModelName()));
    }

    @Test
    public void TestGetX(){
        assert(0==car.getX());
    }

    @Test
    public void TestGetY(){
        assert(0==car.getY());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidGas() {
        double gasAmount = -0.1;
        car.gas(gasAmount);
    }

    @Test
    public void testBrake() {
        double breakAmount = 0.6;
        car.startEngine();
        car.gas(1);
        double speed = car.getCurrentSpeed();
        car.brake(breakAmount);

        assert car.getCurrentSpeed() == Math.max(speed - car.speedFactor() * breakAmount, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidBrake() {
        double brakeAmount = -3.1;
        car.startEngine();
        car.brake(brakeAmount);
    }

    @Test
    public void testTurnLeft() {
        car.turnLeft();
        assert (car.getDirection() == 3);
        car.turnLeft();
        assert (car.getDirection() == 2);
        car.turnLeft();
        assert (car.getDirection() == 1);
        car.turnLeft();
        assert (car.getDirection() == 0);
    }

    @Test
    public void testTurnRight() {
        car.turnRight();
        assert (car.getDirection() == 1);
        car.turnRight();
        assert (car.getDirection() == 2);
        car.turnRight();
        assert (car.getDirection() == 3);
        car.turnRight();
        assert (car.getDirection() == 0);
    }

    @Test
    public void testCarMovement(){
        car.startEngine();
        car.gas(1);
        car.move();
        car.move();

        car.turnLeft();
        car.move();

        car.turnRight();
        car.turnLeft();
        car.move();

        double x = car.getX();
        double y = car.getY();

        assert x == -2.7;
        assert y == 2.7;
    }
}