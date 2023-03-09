package Day011.Task3;

import java.util.ArrayList;
import java.util.List;

public class Test {
    /**
     * 3. *Выполнять в подпапке task3 в day11*
     * Создать класс Музыкальная Группа (англ. MusicBand) с полями name и year
     * (название музыкальной группы и год основания). Создать 10 или более экземпляров
     * класса MusicBand , добавить их в список (выбирайте такие музыкальные группы,
     * которые были созданы как до 2000 года, так и после, жанр не важен). Перемешать
     * список. Создать статический метод в классе Task3:
     * public static List<MusicBand> groupsAfter2000(List<MusicBand>
     * bands)
     * Этот метод принимает список групп в качестве аргумента и возвращает новый список,
     * состоящий из групп, основанных после 2000 года. Вызвать метод
     * groupsAfter2000(List<MusicBand> bands) в методе main() на вашем списке
     * из 10 групп. Вывести в консоль оба списка (оригинальный и с группами, основанными
     * после 2000 года).
     */
    public static void main(String[] args) {
        MusicBand musicBand2 = new MusicBand("Green Day",1987);
        MusicBand musicBand7 = new MusicBand("RoyalBlood",2013);
        MusicBand musicBand1 = new MusicBand("Coldplay",1996);
        MusicBand musicBand4 = new MusicBand("Outkast",1991);
        MusicBand musicBand5 = new MusicBand("Foo Fighters",1994);
        MusicBand musicBand3 = new MusicBand("Linkin park",1996);
        MusicBand musicBand6 = new MusicBand("Arctic Monkeys",2002);
        MusicBand musicBand8 = new MusicBand("Sleeping with Sirens",2009);
        MusicBand musicBand10 = new MusicBand("Black Veil Brides",2006);
        MusicBand musicBand9 = new MusicBand("5 seconds of summer",2011);
        List<MusicBand> musicBandList = new ArrayList<>();
        musicBandList.add(musicBand2);
        musicBandList.add(musicBand9);
        musicBandList.add(musicBand4);
        musicBandList.add(musicBand8);
        musicBandList.add(musicBand7);
        musicBandList.add(musicBand1);
        musicBandList.add(musicBand3);
        musicBandList.add(musicBand6);
        musicBandList.add(musicBand5);
        musicBandList.add(musicBand10);

        for(MusicBand musicBand: musicBandList){
            System.out.println(musicBand);
        }
        System.out.println();

        for(MusicBand musicBand: groupsAfter2000(musicBandList)){
            System.out.println(musicBand);
        }
    }
    public static List<MusicBand> groupsAfter2000(List<MusicBand>bands){
        ArrayList<MusicBand> musicBandList1 = new ArrayList<>();
        for (MusicBand band:bands){
            if(band.getAge()>2000){
                musicBandList1.add(band);
            }
        }
        return musicBandList1;
    }
}
