package Day011.Task5;

import Day011.Task4.MusicBand1;

import java.util.ArrayList;
import java.util.List;

public class Test {
    /**
     * 5. *Выполнять в подпапке task5 в day12*
     * Скопировать MusicBand из прошлого задания и доработать - теперь у участника
     * музыкальной группы есть не только имя, но и возраст. Соответственно, теперь под
     * участником понимается не строка, а объект класса MusicArtist. Необходимо
     * реализовать класс MusicArtist и доработать класс MusicBand (создать копию
     * класса) таким образом, чтобы участники были - объекты класса MusicArtist. После
     * этого, надо сделать то же самое, что и требовалось в 4 задании - слить две группы и
     * проверить состав групп после слияния. Методы для слияния и для вывода участников
     * в консоль необходимо тоже переработать, чтобы они работали с объектами класса
     * MusicArtist
     */
    public static void main(String[] args) {
        MusicBand musicBand1 = new MusicBand("Linkin park",1996);
        MusicBand musicBand2 = new MusicBand("Arctic Monkeys",2002);
        musicBand1.printMembers();
        musicBand2.printMembers();
        musicBand1.setMember("Анатолий","Воробьев");
        musicBand1.setMember("Николай","Горин");
        musicBand1.setMember("Владислав","Феодосев");
        musicBand1.printMembers();
        musicBand2.setMember("Андрей","Ослов");
        musicBand2.setMember("Генадий","Николаев");
        musicBand2.printMembers();
        MusicBand.transferMembers(musicBand1,musicBand2);
        musicBand1.printMembers();
        musicBand2.printMembers();
    }
}
