package Day3;

import java.util.Scanner;

public class Task1 {
    /**
     * 1. Реализовать программу, которая в консоль выводит название страны, принимая на
     * вход название города. Программа должна работать до тех пор, пока не будет введено
     * слово “Stop”.
     * Реализовать, используя следующие данные:
     * Москва, Владивосток, Ростов - Россия
     * Рим, Милан, Турин - Италия
     * Ливерпуль, Манчестер, Лондон - Англия
     * Берлин, Мюнхен, Кёльн - Германия
     * При вводе любого другого города, вывести сообщение “Неизвестная страна”.
     * <p>
     * Пример 1:
     * Input:
     * Милан
     * Output:
     * Италия
     * <p>
     * Пример 2:
     * Input:
     * Дублин
     * Output:
     * Неизвестная страна
     * <p>
     * Пример 3:
     * Input:
     * Stop
     * Output:
     * *программа завершила работу*
     */
    public static void main(String[] args) {
        whatCountry();
    }
    public static void whatCountry(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите названия города в Италии/России/Англии/Германии, если хотите остановить программу напиишите 'Stop'");

        boolean s = true;
        while (s) {
            String str = scanner.nextLine();
            switch (str) {
                case "Москва", "Владивосток", "Ростов" -> {
                    System.out.println("Россия");
                    continue;
                }
                case "Рим", "Милан", "Турин" -> {
                    System.out.println("Италия");
                    continue;
                }
                case "Ливерпуль", "Манчестер", "Лондон" -> {
                    System.out.println("Англия");
                    continue;
                }
                case "Берлин", "Мюнхен", "Кёльн" -> {
                    System.out.println("Германия");
                    continue;
                }
                case "Stop", "stop" -> {
                    s = false;
                }
                default -> {
                    System.out.println("Неизвестаня страна");
                    continue;
                }
            }
        }
    }
}
