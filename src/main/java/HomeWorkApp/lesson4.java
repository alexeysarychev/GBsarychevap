package HomeWorkApp;
import java.util.Random;
import java.util.Scanner;

public class lesson4 {
    public static int RAZMER = 5;
    public static int LONG = 4;
    public static int enemyX = RAZMER + 1;
    public static int enemyY = RAZMER + 1;
    public static final char PUSTO = '•';
    public static final char KRESTIK = 'X';
    public static final char NOLIK = 'O';
    public static char[][] map;
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();
    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(KRESTIK)) {
                System.out.println("Ты победил, кожанный мешок");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(NOLIK)) {
                System.out.println("Я победил, кожанный мешок");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Гейм овер");
    }
    public static boolean checkWin(char symb) {
        int right = 1;
        int downRight = 1;
        int down = 1;
        int downLeft = 1;
        int max = 0;
        for (int j = 0; j < RAZMER; j++) {
            for (int i = 0; i < RAZMER; i++) {
                if (map[i][j] == symb) {
                    for (int cnt = 1; cnt < LONG; cnt++) {
                        if (cnt + i < RAZMER && map[i + cnt][j] == symb) {
                            right++;
                            if (max <= right) {
                                if (i - 1 > 0 && map [i - 1][j] == PUSTO) {
                                    enemyX = i - 1;
                                    enemyY = j;
                                    max = right;
                                } else if (i + cnt + 1 < RAZMER && map [i + cnt + 1][j] == PUSTO) {
                                    enemyX = i + cnt + 1;
                                    enemyY = j;
                                    max = right;
                                }
                            }
                        } else {
                            right = 1;
                        }
                        if (cnt + i < RAZMER && cnt + j < RAZMER && map[i + cnt][j + cnt] == symb) {
                            downRight++;
                            if (max <= downRight) {
                                if (i - 1 > 0 && j - 1 > 0 && map [i - 1][j - 1] == PUSTO) {
                                    enemyX = i - 1;
                                    enemyY = j - 1;
                                    max = downRight;
                                } else if (i + cnt + 1 < RAZMER && j + cnt + 1 < RAZMER && map [i + cnt + 1][j + cnt + 1] == PUSTO) {
                                    enemyX = i + cnt + 1;
                                    enemyY = j + cnt + 1;
                                    max = downRight;
                                }
                            }
                        } else {
                            downRight = 1;
                        }
                        if (cnt + j < RAZMER && map[i][j + cnt] == symb) {
                            down++;
                            if (max <= down) {
                                if (cnt + j < RAZMER && map [i][cnt + j] == PUSTO) {
                                    enemyX = i;
                                    enemyY = cnt + j;
                                    max = down;
                                } else if (j - 1 > 0 && map [i][j - 1] == PUSTO) {
                                    enemyX = i;
                                    enemyY = j - 1;
                                    max = down;
                                }
                            }
                        } else {
                            down = 1;
                        }
                        if (i - cnt > -1 && cnt + j < RAZMER && map[i - cnt][j + cnt] == symb) {
                            downLeft++;
                            if (max <= downLeft) {
                                if (i > 0 && j + 1 < RAZMER && map [i - 1][j + 1] == PUSTO) {
                                    enemyX = i - 1;
                                    enemyY = j + 1;
                                    max = downLeft;

                                } else if (i + 1 < RAZMER && j > 0 && map [i + 1][j - 1] == PUSTO) {
                                    enemyX = i + 1;
                                    enemyY = j - 1;
                                    max = downLeft;
                                }
                            }
                        } else {
                            downLeft = 1;
                        }
                    }
                    if (right == LONG ||
                            downRight == LONG ||
                            down == LONG ||
                            downLeft == LONG) return true;
                }
            }
        }
        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < RAZMER; i++) {
            for (int j = 0; j < RAZMER; j++) {
                if (map[i][j] == PUSTO) return false;
            }
        }
        return true;
    }
    public static void aiTurn() {
        int x, y;
        int i = RAZMER + 1;
        if (enemyX != i) {
            x = enemyX;
            y = enemyY;
            System.out.println("Рекомендация для компа " + (x + 1) + " " + (y + 1));
        } else {
                x = rand.nextInt(RAZMER);
                y = rand.nextInt(RAZMER);
        }
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y +
                1));
        map[x][y] = NOLIK;
    }
    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y)); // while(isCellValid(x, y) == false)
        map[x][y] = KRESTIK;
    }
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= RAZMER || y < 0 || y >= RAZMER) return false;
        return map[x][y] == PUSTO;
    }
    public static void initMap() {
        map = new char[RAZMER][RAZMER];
        for (int i = 0; i < RAZMER; i++) {
            for (int j = 0; j < RAZMER; j++) {
                map[i][j] = PUSTO;
            }
        }
    }
    public static void printMap() {
        for (int i = 0; i <= RAZMER; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int j = 0; j < RAZMER; j++) {
            System.out.print((j + 1) + " ");
            for (int i = 0; i < RAZMER; i++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
