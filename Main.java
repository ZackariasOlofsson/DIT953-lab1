public class Main {

    // en mainmetod
    public static void main(String[] args) {
        Nyvolvo mycar = new Nyvolvo();
        System.out.println(mycar.getNrDoors()); // instansvariabler private men metoder public(protected?)
        System.out.println(mycar.getEnginePower());
    }

}
