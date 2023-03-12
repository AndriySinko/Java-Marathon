package Day014;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    /**
     * Вам дан файл с информацией об остатках обуви на складе
     * (shoes.csv). Это пример реальной выгрузки остатков из 1С
     * в csv файл (формат файла с разделителями, в качестве разделителя использован
     * символ “;”). В этом файле содержится информация о названии модели обуви, ее
     * размер и оставшееся на складе количество.
     * До преобразования в csv это была таблица с тремя колонками:
     * Название Размер Кол-во
     * Ботинки HS РАН-Р 400 чер. ЗП 45 4
     * Ботинки PANDA САНИТАРИ 3916 S1 SRC бел. 37 1
     * ...
     * Необходимо сформировать новый файл
     * (missing_shoes.txt) с информацией о моделях и
     * размерах обуви, которой нет на складе (количество = 0). Для этого реализуйте
     * программу, которая принимает на вход csv файл и создает новый txt файл
     * следующего содержания (должно получиться 11 строк):
     * Ботинки СВАРЩИК ут М.1398 ЗП, 40, 0
     * Ботинки СВАРЩИК ут М.1398 ЗП, 45, 0
     * Ботинки ТОФФ БЕРКУТ И с выс.берцами ут ч, 38, 0
     * ...
     * Помимо этого нужно создать список и добавить в него недостающие модели, и вывести в консоль.
     */
    public static void main(String[] args) throws FileNotFoundException {
        List<String> missShoes = new ArrayList<>();
        String s = File.separator;
        File file = new File("C:"+s+"Users"+s+"Андрiй"+s+"Programming"+s+"MarathonAlishev"+s+"shoes.csv");
        Scanner scanner = new Scanner(file);
        PrintWriter printWriter = new PrintWriter("C:"+s+"Users"+s+"Андрiй"+s+"Programming"+s+"MarathonAlishev"
                +s+"missing_shoes.txt");
        while (scanner.hasNextLine()){
            String string = scanner.nextLine();
            String[] strings = string.split(";");
            if(Integer.parseInt(strings[strings.length-1])==0){
                printWriter.println(strings[0]+" "+strings[1]+" "+strings[2]);
                missShoes.add(strings[0]+" "+strings[1]+" "+strings[2]);
            }
        }
        printWriter.close();
        scanner.close();
        int i = 1;
        for (String missShoe : missShoes) {
            System.out.println(i+": "+missShoe);
            i++;
        }
    }
}
