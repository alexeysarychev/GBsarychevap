package HomeWorkApp;

public class MainClass {
    public static boolean full = false;

    public static void main(String[] args) {
        HangryCat cat = new HangryCat("Barsik", 5, full);
        Plate plate = new Plate(100);
        plate.info();
        cat.eat(plate);
        plate.info();
        cat.info();
    }
}