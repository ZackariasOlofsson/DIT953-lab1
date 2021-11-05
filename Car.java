import java.awt.*;

// har skrivit in instansvariabler, konstruktorer och metoder i superklassen, och skapat två nya subklasser

public class Car {

    // instansvariabler
    private int nrDoors; // Number of doors on the car
    private double enginePower; // Engine power of the car
    private double currentSpeed; // The current speed of the car
    private Color color; // Color of the car
    private String modelName; // The car model name

    // konstruktor
    public Car(int nrDoors, double enginePower, Color color, String modelName){
        this.nrDoors=nrDoors;
        this.enginePower=enginePower;
        this.color=color;
        this.modelName=modelName;
        stopEngine();
    }

    // metoder
    public int getNrDoors(){
        return this.nrDoors;
    }

    public double getEnginePower(){
        return enginePower; // kan ha this. men behöver inte
    }

    public double getCurrentSpeed(){
        return currentSpeed;
    }

    public Color getColor(){
        return color;
    }

    public void setColor(Color clr){
        color = clr;
    }

    public void startEngine(){
        currentSpeed = 0.1;
    }

    public void stopEngine(){
        currentSpeed = 0;
    }

    public abstract double speedFactor();

    protected abstract void incrementSpeed(double amount);

    protected abstract void decrementSpeed(double amount);

}
