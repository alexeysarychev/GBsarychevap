package HomeWorkApp;

public class Lesson6 {
    public static int catNumber = 0;
    public static int dogNumber = 0;

    public static void main(String[] args) {
        Animal animal = new Animal("Дружок", "Рыжий", 3,2, "Самец");
        Cat cat = new Cat("Барсик", "Белый");
        Dog dog = new Dog("Бим", "Белый");
        System.out.println("Метод 'animalInfo' для родительского класса");
        animal.animalInfo();
        System.out.println("\n\nМетод 'animalInfo' для класса с наследованием 'Cat'");
        cat.animalInfo();
        System.out.println("\n\nМетод 'catInfo' для класса с наследованием 'Cat'");
        cat.catInfo();
        System.out.println("\n\nМетод 'catInfo' для класса с наследованием 'Dog'");
        dog.dogInfo();

        cat.run(201);
        dog.run(500);
        cat.sweam(201);
        dog.sweam(500);
        cat.jump(201);
        dog.jump(500);

        System.out.println("\n\nПодсчёт объектов:");
        System.out.println("Котов созданно " + catNumber);
        System.out.println("Собак созданно " + dogNumber);

    }
}
