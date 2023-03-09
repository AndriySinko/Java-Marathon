package Day011.Task5;

public class MusicArtists {
    private String name;
    private String surname;

    public MusicArtists(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "MusicArtists{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
