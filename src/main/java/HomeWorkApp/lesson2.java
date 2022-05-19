package HomeWorkApp;

import java.util.Scanner;

public class lesson2 {
    public static void main(String[] args) {
        System.out.println(sumTwoNum());
        detectNegative();
        System.out.println(detectNegativeReturn());
        printStringSometimes("Лёша скромный", 6);
    }

    private static boolean sumTwoNum() {
        System.out.println("Метод складывает два введённых целых числа. Если сумма >=10 и <=20, то возвращает \"true\".");
        Scanner in = new Scanner(System.in);
        System.out.print("Введи первое число: ");
        int num1 = in.nextInt();
        System.out.print("Введи второе число: ");
        int num2 = in.nextInt();
//        in.close();
        return num1 + num2 >= 10 & num1 + num2 <= 20;
    }

    private static void detectNegative() {
        System.out.println("Метод определяет знак числа");
        Scanner in = new Scanner(System.in);
        System.out.print("Введи число: ");
        int num = in.nextInt();
//        in.close();
        if (num < 0 ) {
            System.out.println("Число " + num + " отрицательное");
        }

        else {
            System.out.println("Число " + num + " положительное");
        }
    }

    private static boolean detectNegativeReturn() {
        System.out.println("Метод возвращает \"true\", если число отрицательное и \"false\" в противном случае");
        Scanner in = new Scanner(System.in);
        System.out.print("Введи число: ");
        int num = in.nextInt();
        in.close();
        return num < 0;
    }

    private static void printStringSometimes(String text, int howMach) {
        System.out.println("Метод выводит в консоль \"" + text + "\" " + howMach + " раз.");
        for (int i = 0; i < howMach; i++) {
            System.out.println(i + 1 + ") " + text);
        }

    }
}
