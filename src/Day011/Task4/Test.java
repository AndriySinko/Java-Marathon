package Day011.Task4;

import Day011.Task3.MusicBand;

public class Test {
    /**
     *4. *Выполнять в подпапке task4 в day11*
     * Скопировать MusicBand из прошлого задания и доработать таким образом, чтобы в
     * группу можно было добавлять и удалять участников. Под участником понимается
     * строка (String) с именем и фамилией. Реализовать статический метод слияния групп
     * (в классе MusicBand), т.е. все участники группы А переходят в группу B. Название
     * метода: transferMembers. Этот метод принимает в качестве аргументов два
     * экземпляра класса MusicBand. Реализовать метод printMembers (в классе
     * MusicBand), выводящий список участников в консоль. Проверить состав групп после
     * слияния.
     */
    public static void main(String[] args) {
        MusicBand1 musicBand1 = new MusicBand1("Linkin park",1996);
        MusicBand1 musicBand2 = new MusicBand1("Arctic Monkeys",2002);
        musicBand1.printMembers();
        musicBand2.printMembers();
        musicBand1.setMember("Никита Ковалев");
        musicBand1.setMember("Николай Соловьев");
        musicBand1.setMember("Арсений Бугарин");
        musicBand1.printMembers();
        musicBand2.setMember("Андрей Столяров");
        musicBand2.setMember("Михаил Жванецкий");
        musicBand2.printMembers();

        MusicBand1.transferMembers(musicBand1,musicBand2);
        musicBand1.printMembers();
        musicBand2.printMembers();
    }
}
