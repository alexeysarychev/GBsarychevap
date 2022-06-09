package HomeWorkApp;

public class HangryCat {
    private String name;
    private int appetite;
    private boolean wellFed;
    public HangryCat(String name, int appetite, boolean wellFed) {
        this.name = name;
        this.appetite = appetite;
        this.wellFed = wellFed;
    }

    public void full() {
       wellFed = true;
    }

    public void eat(Plate p) {
        p.decreaseFood(appetite);
    }
    public void wellFed(boolean w) {
        wellFed = w;
    }
    public void info() {
        System.out.println("\nИмя: " + name + "\nПрожорливость: " + appetite + "\nСытость: " + wellFed);
    }

}
