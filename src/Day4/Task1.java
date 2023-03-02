package Day4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    /**
     * 1. С клавиатуры вводится число n - размер массива. Необходимо создать массив
     * указанного размера и заполнить его случайными числами от 0 до 10. Затем вывести
     * содержимое массива в консоль, а также вывести в консоль информацию о:
     * а) Длине массива
     * б) Количестве чисел больше 8
     * в) Количестве чисел равных 1
     * г) Количестве четных чисел
     * д) Количестве нечетных чисел
     * е) Сумме всех элементов массива
     *
     * Пример:
     * Введено число 10. Сгенерирован следующий массив:
     * [4, 8, 4, 9, 5, 2, 2, 3, 3, 6]
     * Информация о массиве:
     * Длина массива: 10
     * Количество чисел больше 8: 1
     * Количество чисел равных 1: 0
     * Количество четных чисел: 6
     * Количество нечетных чисел: 4
     * Сумма всех элементов массива: 46
     */
    public static void main(String[] args) {
        Example example = new Example();
    }
}

class Example{
    private int[] array;

    private int counter;
    private int counter2;
    public Example(){
        ex();
        ex1();
        ex2();
        ex3();
        ex4();
    }
    private void ex(){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int x = scanner.nextInt();
        array = new int[x];
        for(int i=0;i< array.length;i++){
            array[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Информация о массиве");
        System.out.println("Длинна массива: "+array.length);
    }
    private void ex1() {
        for (int i:array) {
            if(i>8){
                counter++;
                continue;
            }else {
                counter +=0;
            }
        }
        System.out.println("Количество чисел больше 8: "+counter);
        counter=0;
    }
    private void ex2(){
        for (int i:array) {
            if(i==1){
                counter++;
                continue;
            }else {
                counter +=0;
            }
        }
        System.out.println("Количество чисел равных 1: "+counter);
        counter=0;
    }
    private void ex3(){
        for (int i:array) {
            if(i%2==0){
                counter++;
                continue;
            }else {
                counter2++;
            }
        }
        System.out.println("Количество парных чисел: "+counter);
        System.out.println("Количество непарных чисел: "+counter2);
    }
    private void ex4(){
        int x=0;
        for (int i:array) {
            x+=i;
        }
        System.out.println("Сумма всех числе массива: "+x);
    }
}
