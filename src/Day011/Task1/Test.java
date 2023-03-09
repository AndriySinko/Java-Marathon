package Day011.Task1;

import java.util.ArrayList;
import java.util.List;

public class Test {
    /**
     * 1. Создать список строк, добавить в него 5 марок автомобилей, вывести список в
     * консоль. Добавить в середину еще 1 автомобиль, удалить самый первый автомобиль
     * из списка. Распечатать список.
     */
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("Porsche");
        cars.add("Range-Rover");
        cars.add("Mercedes");
        cars.add("BMW");
        cars.add("Audi");
        System.out.println(cars);
        cars.add(2,"Volkswagen");
        cars.remove(0);
        System.out.println(cars);
    }
}
