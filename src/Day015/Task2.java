package Day015;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    /**
     * 2. Реализовать программу, записывающую числа разных типов в 2 файла.
     * Файл 1 должен называться “file1.txt”, а Файл 2 должен называться “file2.txt”.
     * Оба файла должны находиться в корне проекта. Создаваться файлы должны не
     * вручную, а при запуске программы.
     * Файл 1 должен содержать 1000 случайных чисел от 0 до 100.
     * Файл 2 создается на основании Файла 1, но содержит числа вещественного типа
     * данных.
     * Метод заполнения Файла 2 следующий: для каждой группы из 20 целых чисел из
     * Файла 1 рассчитывается их среднее арифметическое. Затем, полученное значение
     * записывается в Файл 2. Таким образом в Файле 2 будет находиться 50 вещественных
     * чисел (1000 / 20 = 50).
     * После того, как Файл 2 будет сформирован, необходимо реализовать статический
     * метод printResult(File file). Этот метод должен рассчитать сумму всех
     * вещественных чисел из Файла 2 и вывести её в консоль, отбросив вещественную
     * часть.
     */
    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        Random random = new Random();
        PrintWriter printWriter1 = new PrintWriter(file1);
        PrintWriter printWriter2 = new PrintWriter(file2);
        int sum = 0;
        int counter = 0;
        for (int i = 0; i < 1000; i++) {
        int x = random.nextInt(100);
        if(counter==20){
            double d = sum / (double) counter;
            printWriter2.println(d);
            counter=0;
        }
        printWriter1.println(x);
        sum += x;
        counter++;
        }
        printWriter1.close();
        printWriter2.close();
        printResult(file2);
    }
    public static void printResult(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        double sum = 0;
        int counter = 1;
        while (scanner.hasNextLine()){
            String s = scanner.nextLine();
            sum += Double.parseDouble(s);
            counter++;
        }
        scanner.close();
        int result = (int) (sum/ counter);
        System.out.println(sum+" / "+counter+" = "+result);
    }
}
