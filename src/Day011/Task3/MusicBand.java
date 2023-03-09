package Day011.Task3;

public class MusicBand {
    private String name;
    private int age;

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
                ", year=" + age +
                '}';
    }
}
