import java.awt.*;

/**
 * The Car class contains fundamental methods required to describe the behaviour of a simple car.
 */
abstract public class Car implements Movable{

    /**
     * Variables
     */
    private final int nrDoors; // Number of doors on the car
    private final double enginePower; // Engine power of the car
    private double currentSpeed; // The current speed of the car
    private Color color; // Color of the car
    private final String modelName; // The car model name
    private int direction = 0; // 0 = north, 1 = east, 2 = south, 3 = west
    private double xPos = 0;
    private double yPos = 0;


    /**
     * Constructor for a simple car with basic functionality
     * @param nrDoors Number of doors on the car.
     * @param enginePower The engine power of the car.
     * @param color The color of the car.
     * @param modelName The model of the car.
     */
    protected Car(int nrDoors, double enginePower, Color color, String modelName){
        this.nrDoors=nrDoors;
        this.enginePower=enginePower;
        this.color=color;
        this.modelName=modelName;
        stopEngine();
    }

    /**
     * Gets the number of doors on the car.
     * @return The number of doors on the car.
     */
    public int getNrDoors(){
        return this.nrDoors;
    }

    /**
     * Gets the engine power of the car.
     * @return The engine power of the car.
     */
    public double getEnginePower(){
        return enginePower;
    }

    /**
     * Gets the current speed of the car.
     * @return The current speed of the car.
     */
    public double getCurrentSpeed(){
        return currentSpeed;
    }

    /**
     * Sets the current speed of the car to the value of the argument.
     * @param speed The new speed of the car.
     */
    private void setCurrentSpeed(double speed) { currentSpeed = speed;}

    /**
     * Gets the color of the car.
     * @return The color of the car.
     */
    public Color getColor(){
        return color;
    }

    /**
     * Sets the color of the car to the given argument.
     * @param clr the color the car will have
     */
    public void setColor(Color clr){
        color = clr;
    }

    /**
     * Starts the engine of the car, setting the current speed to 0,1.
     */
    public void startEngine(){
        currentSpeed = 0.1;
    }

    /**
     * Stops the engine of the car, setting the current speed to 0.
     */
    public void stopEngine(){
        currentSpeed = 0;
    }

    /**
     * Gets the speed factor of the car.
     * @return The speed factor of the car
     */
    public abstract double speedFactor();

    /**
     * Increases the speed of the car by the speed factor times the argument up to a maximum of the cars' engine power.
     * @param amount The percentage to gas with [0,1].
     */
    public void gas(double amount) {
        if(amount < 0 || amount > 1) {
            throw new IllegalArgumentException("Incorrect interval of gas");
        }
        setCurrentSpeed(Math.min(getCurrentSpeed() + speedFactor() * amount, getEnginePower()));
    }

    /**
     * Decreases the speed of the car by the speed factor times the argument down to a minimum of 0.
     * @param amount Make the car break with an amount of [0,1]
     */
    public void brake(double amount) {
        if(amount < 0 || amount > 1) {
            throw new IllegalArgumentException("Incorrect interval of gas");
        }
        setCurrentSpeed(Math.max(getCurrentSpeed() - speedFactor() * amount,0));
    }

    /**
     * Gets the model name of the car.
     * @return Returns the model name of the car.
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * Moves the car in the current direction according to its current speed.
     */
    public void move() {
        this.xPos += ((direction == 1 ? 1 : 0) - (direction == 3 ? 1 : 0))*getCurrentSpeed();
        this.yPos +=((direction == 0 ? 1 : 0) - (direction == 2 ? 1 : 0))*getCurrentSpeed();
    }

    /**
     * Turns the car 90 degrees to the left.
     */
    public void turnLeft() {
        direction = ((direction - 1) % 4 + 4) % 4;
    }

    /**
     * Turns the car 90 degrees to the right.
     */
    public void turnRight() {
        direction = (direction + 1) % 4;
    }

    /**
     * Gets the x-position of the car.
     * @return The current x-position of the car.
     */
    public double getX() {return xPos;}

    /**
     * Gets the y-position of the car.
     * @return The current y position of the car.
     */
    public double getY() {return yPos;}

    /**
     * Gets the current direction of the car.
     *
     * <ul>
     *     <li>0 = North | +y</li>
     *     <li>1 = East  | +x</li>
     *     <li>2 = South | -y</li>
     *     <li>3 = West  | -x</li>
     * </ul>
     *
     * @return The direction of the car.
     */
    public int getDirection(){
        return direction;
    }
}
