public class Main {

    // en mainmetod
    public static void main(String[] args) {
        Nyvolvo mycar = new Nyvolvo();
        System.out.println(mycar.getNrDoors()); // instansvariabler private men metoder public(protected?) för att kunn
        System.out.println(mycar.getEnginePower());
    }

}
