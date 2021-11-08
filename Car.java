import java.awt.*;

/**
 * Super class
 */
abstract public class Car implements Movable{

    /**
     * Variables
     */
    // instansvariabler
    private final int nrDoors; // Number of doors on the car
    private final double enginePower; // Engine power of the car
    private double currentSpeed; // The current speed of the car
    private Color color; // Color of the car
    private final String modelName; // The car model name
    private int direction = 0;
    private float xPos = 0;
    private float yPos = 0;


    /**
     * @param nrDoors Number of doors on the car.
     * @param enginePower The engine power of the car.
     * @param color The color of the car.
     * @param modelName The model of the car.
     */
    // konstruktor
    protected Car(int nrDoors, double enginePower, Color color, String modelName){
        this.nrDoors=nrDoors;
        this.enginePower=enginePower;
        this.color=color;
        this.modelName=modelName;
        stopEngine();
    }

    /**
     * @return The number of doors on the car.
     */
    // metoder
    public int getNrDoors(){
        return this.nrDoors;
    }

    /**
     * @return The engine power of the car.
     */
    public double getEnginePower(){
        return enginePower; // kan ha this. men behöver inte
    }

    /**
     * @return The current speed of the car.
     */
    public double getCurrentSpeed(){
        return currentSpeed;
    }

    /**
     * @param speed The new speed of the car.
     */
    protected void setCurrentSpeed(double speed) { currentSpeed = speed;}

    /**
     * @return The color of the car
     */
    public Color getColor(){
        return color;
    }

    /**
     * @param clr the color the car will have
     * Changes the color of the car
     */
    public void setColor(Color clr){
        color = clr;
    }

    /**
     * Starts the engine of the car
     */
    public void startEngine(){
        currentSpeed = 0.1;
    }

    /**
     * Stops the engine of the car
     */
    public void stopEngine(){
        currentSpeed = 0;
    }

    /**
     * @return The speedfactor of the car
     */
    public abstract double speedFactor();

    /**
     * @param amount the percentage to use for increment of the speed, [0,1]
     * Increases the current speed of the car
     */
    private void incrementSpeed(double amount){
        setCurrentSpeed(Math.min(getCurrentSpeed() + speedFactor() * amount, getEnginePower()));
    }

    /**
     * @param amount percentage [0,1].
     * Decreases the speed by the speed factor times a given percentage.
     */
    private void decrementSpeed(double amount){
        setCurrentSpeed(Math.max(getCurrentSpeed() - speedFactor() * amount,0));
    }

    /**
     * @param amount Make the car accelerate with an amount of [0,1].
     */
    public void gas(double amount) {
        if(amount < 0 || amount > 1) {
            throw new IllegalArgumentException("Incorrect interval of gas");
        }
        incrementSpeed(amount);
    }

    /**
     * @param amount Make the car break with an amount of [0,1]
     */
    public void brake(double amount) {
        if(amount < 0 || amount > 1) {
            throw new IllegalArgumentException("Incorrect interval of gas");
        }
        decrementSpeed(amount);
    }

    /**
     * @return Returns the model name of the car.
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * Moves the car in the current direction.
     */
    public void move() {
        this.xPos += (float) ((direction == 1 ? 1 : 0) - (direction == 3 ? 1 : 0))*getCurrentSpeed();
        this.yPos  += (float) ((direction == 0 ? 1 : 0) - (direction == 2 ? 1 : 0))*getCurrentSpeed();
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
     * @return The current x position of the car.
     */
    public float getX() {return xPos;}

    /**
     * @return The current y position of the car.
     */
    public float getY() {return yPos;}

}
