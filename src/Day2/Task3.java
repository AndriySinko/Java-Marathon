package Day2;

import java.util.Scanner;

public class Task3 {
    /**
     * 3. Реализовать задание Task2, используя цикл while.
     *
     * Пример:
     * Input:
     * 7 78
     * Output:
     * 15 25 35 45 55 65 75
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 2 числа через пробел, второе число должно быть больше");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a >= b) {
            System.out.println("Некорректный ввод");
        } else {
            int i = a + 1;
            while (i < b) {
                if (i % 5 == 0 && i % 10 != 0) {
                    System.out.print(i + " ");
                }
                i++;
            }
        }
    }
}
