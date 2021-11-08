public class Main {

    // en mainmetod
    public static void main(String[] args) {
        Volvo240 mycar = new Volvo240();
        System.out.println(mycar.getNrDoors());
        System.out.println(mycar.getEnginePower());

        mycar.startEngine();
        mycar.gas(1);
        System.out.println("Speeed " + mycar.getCurrentSpeed());
        mycar.move();
        mycar.move();
        mycar.turnLeft();
        mycar.move();
        System.out.println(mycar.getX());
        System.out.println("\n"+"Position:" + mycar.getX() +","+mycar.getY());

    }

}
