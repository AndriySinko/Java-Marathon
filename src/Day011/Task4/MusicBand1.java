package Day011.Task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand1 {
    private String name;
    private int age;
    private String nameAndSurname;
    private List<String> musicBandsMember = new ArrayList<>();
    public void setMember(String nameAndSurname){
        this.nameAndSurname = nameAndSurname;
        musicBandsMember.add(nameAndSurname);
    }

    public MusicBand1(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", musicBandsMember=" + musicBandsMember +
                '}';
    }
    public static void transferMembers(MusicBand1 a, MusicBand1 b){
        a.musicBandsMember.addAll(b.musicBandsMember);
        b.musicBandsMember.clear();
    }
    public void printMembers() {
        System.out.println("\nУчастники группы "+name+":");
        for (String s : musicBandsMember) {
            if (s != null) {
                System.out.println(s);
            }else {
                System.out.println("Добавьте учасника в группу");
                break;
            }
        }
    }
}
