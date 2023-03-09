package Day011.Task5;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int age;
    private List<MusicArtists> musicBandsMember = new ArrayList<>();
    public void setMember(String nameMember, String surnameMember){
        musicBandsMember.add(new MusicArtists(nameMember,surnameMember));
    }

    public MusicBand(String name, int age) {
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
    public static void transferMembers(MusicBand a, MusicBand b){
        a.musicBandsMember.addAll(b.musicBandsMember);
        b.musicBandsMember.clear();
    }
    public void printMembers() {
        System.out.println("\nУчастники группы "+name+":");
        for (MusicArtists s : musicBandsMember) {
            if (s != null) {
                System.out.println(s);
            }else {
                System.out.println("Добавьте учасника в группу");
                break;
            }
        }
    }
}
