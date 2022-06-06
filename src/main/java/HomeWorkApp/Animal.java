package HomeWorkApp;

public class Animal {
    String name;
    String color;
    Integer ves;
    Integer age;
    String sex;

    public Animal() {
    }

    public Animal(String name, String color, Integer ves, Integer age, String sex) {
        this.name = name;
        this.color = color;
        this.ves = ves;
        this.age = age;
        this.sex = sex;
    }

    public void animalInfo() {
        System.out.println("Животное: " + name);
        System.out.println("     Вес: " + ves);
        System.out.println(" Возраст: " + age);
        System.out.println("     Пол: " + sex);
    }

    public void jump(int distance) {
        System.out.println("\n\nЖивотное подпрыгнуло на " + distance + " метров");
    }

    public void sweam(int distance) {
        System.out.println("\n\nЖивотное проплыло " + distance + " метров");
    }

    public void run(int distance) {
        System.out.println("\n\nЖивотное пробежало " + distance + " метров");
    }

}
