package HomeWorkApp;

import java.util.Scanner;

public class lesson2 {

    public static  Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(sumTwoNum());
        detectNegative();
        System.out.println(detectNegativeReturn());
        in.nextLine(); // Костыль для сканнера - утилизируем возврат строки.
        System.out.print("Введи строку для повтора: ");
        String text = in.nextLine();
        System.out.print("Введи количество повторов: ");
        int howMach = in.nextInt();
        printStringSometimes(text, howMach);
        in.close();
    }

    private static boolean sumTwoNum() {
        System.out.println("Задание №1");
        System.out.println("Метод складывает два введённых целых числа. Если сумма >=10 и <=20, то возвращает \"true\".");
        System.out.print("Введи первое число: ");
        int num1 = in.nextInt();
        System.out.print("Введи второе число: ");
        int num2 = in.nextInt();
        return num1 + num2 >= 10 & num1 + num2 <= 20;
    }

    private static void detectNegative() {
        System.out.println("Задание №2");
        System.out.println("Метод определяет знак числа");
        System.out.print("Введи число: ");
        int num = in.nextInt();
        if (num < 0 ) {
            System.out.println("Число " + num + " отрицательное");
        } else {
            System.out.println("Число " + num + " положительное");
        }
    }

    private static boolean detectNegativeReturn() {
        System.out.println("Задание №3");
        System.out.println("Метод возвращает \"true\", если число отрицательное и \"false\" в противном случае");
        System.out.print("Введи число: ");
        int num = in.nextInt();
        return num < 0;
    }

    private static void printStringSometimes(String text, int howMach) {
        System.out.println("Задание №4");
        System.out.println("Метод выводит в консоль \"" + text + "\" " + howMach + " раз.");
        for (int i = 0; i < howMach; i++) {
            System.out.println(i + 1 + ") " + text);
        }
    }
}
