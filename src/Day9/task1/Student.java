package Day9.task1;

public class Student extends Human {
    private String nameGroup;

    public Student(String name, String nameGroup) {
        super(name);
        this.nameGroup = nameGroup;
    }

    @Override
    void printInfo() {
        super.printInfo();
        System.out.println("Этот студент с именем " + getName());
    }

    public String getNameGroup() {
        return nameGroup;
    }

    public void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }
}
