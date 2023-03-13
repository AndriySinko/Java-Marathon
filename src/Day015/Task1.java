package Day015;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    /**
     * 1. Реализовать программу, которая на вход принимает txt файл с целыми числами
     * (можно использовать файл из задания 1 дня 13) и в качестве ответа выводит в
     * консоль среднее арифметическое этих чисел.
     * Ответ будет являться вещественным числом. В консоль необходимо вывести полную
     * запись вещественного числа.
     * Детали реализации: В классе Task1 создать публичный статический метод
     * printResult(File file), в котором реализовать вышеописанную логику. В методе
     * main() класса Task1 вызвать метод printResult(File file), передав ему в
     * качестве аргумента объект класса File (txt файл с целыми числами).
     * Пример:
     * Числа в txt файле: 5 2 8 34 1 36 77
     * Ответ: 23,286
     */
    public static void main(String[] args) {
        File file = new File("task1.txt");
        try {
            printResult(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static void printResult(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        int sum = 0;
        String s = scanner.nextLine();
        String[] strings = s.split(" ");
        for (String string : strings) {
            sum+=Integer.parseInt(string);
        }
        double result = sum / (double)strings.length;
        System.out.println(result);
    }
}
