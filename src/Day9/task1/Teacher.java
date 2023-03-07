package Day9.task1;

public class Teacher extends Human {
    private String lesson;

    public Teacher(String name, String lesson) {
        super(name);
        this.lesson = lesson;
    }

    @Override
    void printInfo() {
        super.printInfo();
        System.out.println("Этот преподаватель с именем " + getName());
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }
}
