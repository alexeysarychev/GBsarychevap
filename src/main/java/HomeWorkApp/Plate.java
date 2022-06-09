package HomeWorkApp;

public class Plate {
    public int food;
    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        if (n <= food) {
            food -= n;
        }
    }
    public void info() {
        System.out.println("plate: " + food);
    }
}
