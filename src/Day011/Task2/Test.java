package Day011.Task2;

import java.util.ArrayList;
import java.util.List;

public class Test {
    /**
     * 2. Создать новый список, заполнить его четными числами от 0 до 30 и от 300 до 350.
     * Вывести список.
     */
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0;i<=350;i++){
            if(i<=30 || (i>=300 && i<=350)){
                if(i%2==0){
                    integerList.add(i);
                }
            }
        }
        System.out.println(integerList);
    }
}