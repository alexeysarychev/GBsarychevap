package HomeWorkApp;

import static HomeWorkApp.Lesson6.catNumber;

public class Cat extends Animal {
    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
        catNumber++;
    }

    public void catInfo() {
        System.out.println("Кот имя: " + name + "\n   цвет: " + color);
    }

    public void sweam(int distance) {
        System.out.println("\n\nКиса полезла в воду и утонула. Потому что плавать не умела.");
    }

    public void run(int distance) {
        System.out.print("\n\nКиса пробежала " + distance + " м.");
        if (distance > 200) {
            System.out.println(" и упала. Потому что больше 200 метров бегать не могла.");
        }
    }

}
