package HomeWorkApp;

import static HomeWorkApp.Lesson6.dogNumber;

public class Dog extends Animal {
    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
        dogNumber++;
    }

    public void dogInfo() {
        System.out.println("Пёс имя: " + name + "\n   цвет: " + color);
    }

    public void sweam (int distance) {
        System.out.print("\n\nСобака проплыла " + distance + " м.");
        if (distance > 10) {
            System.out.println(" и утонула. Потому что больше 10 метров проплыть не могла.");
        }
    }

    public void run(int distance) {
        System.out.print("\n\nСобака пробежала " + distance + " м.");
        if (distance > 200) {
            System.out.println(" и упала. Потому что больше 500 метров бегать не могла.");
        }
    }
}
