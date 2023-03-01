package Day3;

import java.util.Scanner;

public class Task2 {
    /**
     * 2. Реализовать программу, которая пока работает, принимает на вход от пользователя
     * два числа - делимое и делитель. Для этих двух чисел программа рассчитывает
     * результат деления и выводит его в консоль. Программа останавливает свою работу
     * тогда, когда пользователь вводит 0 в качестве делителя.
     * (для этих вещественных чисел необходимо использовать тип double и метод
     * nextDouble() у Scanner’а соответственно).
     * <p>
     * Пример:
     * Input:
     * 1 2
     * Output:
     * 0.5
     * <p>
     * Input:
     * 100 77
     * Output:
     * 1.2987012987012987
     * <p>
     * Input:
     * 3 0
     * Output:
     * работа программы завершается
     */
    public static void main(String[] args) {
        division();
    }

    public static void division() {
        System.out.println("Введите 2 числа (1 - делимое, 2 - делитель)");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            double value1 = scanner.nextDouble();
            double value2 = scanner.nextDouble();
            if (value2 == 0) {
                break;
            } else {
                System.out.println(value1 / value2);

            }
        }
    }
}
