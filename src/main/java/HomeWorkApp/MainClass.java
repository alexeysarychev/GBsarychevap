package HomeWorkApp;

public class MainClass {
    public static boolean full = false;

    public static void main(String[] args) {
        int lowFood = 0;
        int foodOld = 0;
        Plate plate = new Plate(100);
        HangryCat[] catArray = new HangryCat[5];
        catArray[0] = new HangryCat("Barsik1", 3, full);
        catArray[1] = new HangryCat("Barsik2", 2, full);
        catArray[2] = new HangryCat("Barsik3", 33, full);
        catArray[3] = new HangryCat("Barsik4", 32, full);
        catArray[4] = new HangryCat("Barsik5", 50, full);
        plate.info();
        for (int i = 0; i < 5; i++) {
            foodOld = plate.food;
            catArray[i].eat(plate);
            catArray[i].full(plate.food < foodOld);
            if (plate.food == foodOld) {
                lowFood++;
            }
            catArray[i].info();
        }
        if (lowFood > 0) {
            plate.increaseFood(100);
        }
        plate.info();
    }
}