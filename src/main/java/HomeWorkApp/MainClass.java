package HomeWorkApp;

public class MainClass {
    public static boolean full = false;

    public static void main(String[] args) {
//        HangryCat cat = new HangryCat("Barsik", 5, full);
        Plate plate = new Plate(100);
        HangryCat[] catArray = new HangryCat[5];
        catArray[0] = new HangryCat("Barsik1", 3, full);
        catArray[1] = new HangryCat("Barsik2", 2, full);
        catArray[2] = new HangryCat("Barsik3", 33, full);
        catArray[3] = new HangryCat("Barsik4", 32, full);
        catArray[4] = new HangryCat("Barsik5", 23, full);
        plate.info();
        for (int i = 0; i < 5; i++) {
            int foodOld = plate.food;
            catArray[i].eat(plate);
            catArray[i].full(plate.food < foodOld);
            catArray[i].info();
        }
        plate.info();
    }
}