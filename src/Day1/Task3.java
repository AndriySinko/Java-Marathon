package Day1;

public class Task3 {
    /**
     * Вывести на экран слово “JAVA”, в столбик, чтобы оно повторилось 10 раз, используя цикл на ваше усмотрение
     * (for или while).
     * Output:
     * JAVA
     * JAVA
     * JAVA
     * JAVA
     * JAVA
     * JAVA
     * JAVA
     * JAVA
     * JAVA
     * JAVA
     */
    public static void main(String[] args) {
        System.out.println("First way");
        int i=0;
        while (i<10){
            System.out.println("JAVA");
            i++;
        }


        System.out.println("\nSecond Way");
        for(int x = 0;x<10;x++){
            System.out.println("JAVA");
        }
    }
}
