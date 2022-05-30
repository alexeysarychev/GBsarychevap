package HomeWorkApp;

import java.util.Arrays;

public class lesson3 {
    public static void main(String[] args) {
        replaceZeroToOneAndOneToZero();
        fillFrom1To100();
        multiplyBy2();
        square();
        int len = 9;
        int initialValue = 6;
        System.out.println("Задание 5. Написать метод, принимающий на вход два аргумента: len и initialValue,");
        System.out.println("и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue");
        System.out.println(Arrays.toString(createArray(len, initialValue)));
        minMax();
        int[] sumArray  = new int[] {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println(sumElements(sumArray));
        int step = 3;
        int[] carouselArray = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
        carousel(step, carouselArray);
    }

    private static void replaceZeroToOneAndOneToZero() {
        System.out.println("Задание 1. Задать целочисленный массив, состоящий из элементов 0 и 1.");
        System.out.println("Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0");
        int[] zeroOne  = new int[] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < 10; i++) {
//            zeroOne[i] = 1 - zeroOne[i]; // Замена выполняется вычитанием, но в задании просили использовать условие
            if (zeroOne[i] == 0) {
                zeroOne[i] = 1;
            } else {
                zeroOne[i] = 0;
            }
        }
        System.out.print(Arrays.toString(zeroOne)); // Демонстрация результата
        System.out.println("\n\n");
    }

    private static void fillFrom1To100() {
        System.out.println("Задание 2. Задать пустой целочисленный массив длиной 100.");
        System.out.println("С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 …100");
        int[] oneTo100 = new int[100];
        for (int i = 0; i < 100; i++) {
            oneTo100[i] = i + 1;
        }
        System.out.print(Arrays.toString(oneTo100)); // Демонстрация результата
        System.out.println("\n\n");
    }

    private static void multiplyBy2() {
        System.out.println("Задание 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2");
        int[] multiplyBy2 = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < 12; i++) {
            if (multiplyBy2[i] < 6) {
                multiplyBy2[i] = multiplyBy2[i] * multiplyBy2[i];
            }
        }
        System.out.print(Arrays.toString(multiplyBy2)); // Демонстрация результата
        System.out.println("\n\n");
    }

    private static void square() {
        System.out.println("Задание 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),");
        System.out.println("и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,");
        System.out.println("если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких");
        System.out.println("элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n]");
        int[][] square = new int[10][10];
        for (int i = 0; i < square.length; i++) {
            square[i][i] = 1;
            square[9-i][i] = 1;
            }
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[i].length; j++) {
                System.out.print(square[i][j] + " "); // Демонстрация результата
            }
            System.out.println();
        }
        System.out.println("\n\n");
    }

    private static int[] createArray(int len, int initialValue) {
        int[] newArray = new int[len];
        for (int i = 0; i < len; i++) {
            newArray[i] = initialValue;
        }
        return newArray;
    }

    private static void minMax() {
        System.out.println("Задание 6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы");
        int[] minMax = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Минимальное значение: " + Arrays.stream(minMax).min());
        System.out.println("Максимальное значение: " + Arrays.stream(minMax).max());
    }

    private static boolean sumElements(int[] sendArray) {
        System.out.println("Задание 7. ** Написать метод, в который передается не пустой одномерный");
        System.out.println("целочисленный массив, метод должен вернуть true, если в массиве есть место,");
        System.out.println("в котором сумма левой и правой части массива равны.");
        System.out.println(Arrays.toString(sendArray)); // Распечатаем массив для наглядности
        int beginSum = 0;
        int endSum = Arrays.stream(sendArray).sum();
        for (int i : sendArray) {
            beginSum += i;
            endSum -= i;
            if (beginSum == endSum) {
                return true;
            }
        }
        return false;
    }

    private static void carousel(int step, int[] sendArray) {
        System.out.println("Задание 8. *** Написать метод, которому на вход подается одномерный массив и");
        System.out.println("число n (может быть положительным, или отрицательным), при этом метод должен");
        System.out.println("сместить все элементы массива на n позиций. Элементы смещаются циклично.");
        System.out.println("Для усложнения задачи нельзя пользоваться вспомогательными массивами. Примеры:");
        System.out.println("[ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2");
        System.out.println("(на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.");
        System.out.println("Сдвиг: " + step); // Распечатаем шаг для наглядности
//        System.out.println(Arrays.toString(sendArray)); // Распечатаем начальный массив для наглядности
        int lengthArray = sendArray.length;
        int tmp = 0;
        int targetIndex = 0;
        for (int i = 0; i < lengthArray - 1; i++) {
            targetIndex = (i + step) % (lengthArray - 1);
            if (targetIndex == 0) {
                targetIndex = lengthArray - 1;
            }
            tmp = sendArray[targetIndex];
            sendArray[targetIndex] = sendArray[i];
            sendArray[i] = tmp;
            System.out.println(i + ") " + Arrays.toString(sendArray) + " targetIndex " + targetIndex + " tmp " + tmp); // Распечатаем конечный массив для наглядности
        }
    }

}
