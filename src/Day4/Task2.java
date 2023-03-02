package Day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    /**
     * 2. Создать новый массив размера 100 и заполнить его случайными числами из
     * диапазона от 0 до 10000.
     * Затем, используя циклы for each вывести:
     * - наибольший элемент массива
     * - наименьший элемент массива
     * - количество элементов массива, оканчивающихся на 0
     * - сумму элементов массива, оканчивающихся на 0
     * Использовать сортировку запрещено.
     */
    public static void main(String[] args) {
        Example2 example2 = new Example2();
    }
}
class Example2{
    private int value = 0;

    private int[] array;
    public Example2(){
        ex();
        ex1();
        ex3();
        ex4();
        ex5();
    }
    private void ex(){
        Random random = new Random();
        array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }
    }
    private void ex1(){
        for (int x : array) {
            if (x > value) {
                value = x;
            }
        }
        System.out.println("Наибольший элемент массива: "+value);
        value=1000;
    }
    private void ex3(){
        for (int x:array){
            if(x<value){
                value = x;
            }
        }
        System.out.println("Наименьший элемент массива: "+value);
        value=0;
    }
    public void ex4(){
        for (int i:array){
            if(i%10==0){
                value++;
            }
        }
        System.out.println("Количество элементов массива оканчивающихся на 0: "+value);
        value=0;
    }
    public void ex5(){
        for (int x:array) {
            if(x%10==0){
                value=+x;
            }
        }
        System.out.println("Сумма элементов массива оканчивающихся на 0: "+value);
    }
}