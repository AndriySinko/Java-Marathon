package Day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    /**
     * 3. Заполнить двумерный массив (матрицу) случайными числами от 0 до 50. Размер
     * матрицы задать m=12, n=8 (m - размерность по строкам, n - размерность по колонкам).
     * В консоль вывести индекс строки, сумма чисел в которой максимальна. Если таких
     * строк несколько, вывести индекс последней из них.
     * Пример сгенерированной матрицы (для простоты m=3, n=5):
     * 3 2 1 5 7 // сумма - 18
     * 1 2 5 6 2 // сумма - 16
     * 3 4 9 6 4 // сумма - 26
     * Ответ: 2 (индекс строки, сумма чисел в которой максимальна)
     */
    public static void main(String[] args) {
        Random random = new Random();
        int n = 8;
        int m = 12;
        int[][] matrix = new int[n][m];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(50);
            }
        }
        int maxSum = 0;
        int maxIdx = 0;
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = i; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxIdx = i;
            }
        }
        for (int[] x : matrix) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
        System.out.println(maxSum);
        System.out.println(maxIdx);
    }
}


/**
 My first attempt
        Random random = new Random();
        int n=8;
        int m=12;
        int[][] matrix = new int[n][m];
        for(int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                matrix[i][j]= random.nextInt(50);
            }
        }

        for (int[] x:matrix){
            for (int y:x){
                System.out.print(y+" ");
            }
            System.out.println();
        }

        int g=0;
        int sum=0;
        int[] sums = new int[matrix.length];
        for (int[]x:matrix) {
            for (int y:x) {
                sum+=y;
            }

            for(int i=g;i<matrix.length;i++){
                sums[i]=sum;
            }
            System.out.println(sum);
            sum=0;
            g++;
        }


        int max=0;
        int counter=0;
        for (int x:sums){
            if(x>max){
                max=x;
                counter++;
            }
        }
        System.out.println(counter);
**/
