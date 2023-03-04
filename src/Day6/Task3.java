package Day6;

import java.util.Random;

public class Task3 {
    /**
     * 3. Создать класс Teacher (Преподаватель), имеющий поля “Имя”, “Предмет”. Создать
     * класс Student (Студент) с полем “Имя”.
     * Каждый класс имеет конструктор (с параметрами), set и get методы по
     * необходимости, а также у преподавателя есть метод evaluate (оценить студента),
     * принимающий в качестве аргумента студента, и работающий следующим образом:
     * внутри метода случайным образом генерируется число от 2 до 5, выводится строка:
     * "Преподаватель ИМЯПРЕПОДАВАТЕЛЯ оценил студента с именем ИМЯСТУДЕНТА
     * по предмету ИМЯПРЕДМЕТА на оценку ОЦЕНКА."
     * Все слова, написанные большими буквами, должны быть заменены
     * соответствующими значениями. ОЦЕНКА должна принимать значения "отлично”,
     * "хорошо”, "удовлетворительно" или "неудовлетворительно", в зависимости от
     * значения случайного числа.
     * Создайте по 1 экземпляру каждого класса, у преподавателя вызовите метод оценки
     * студента, передав студента в качестве аргумента метода
     */
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Галина Степановна","биология");
        Student student = new Student("Руслан");
        teacher.evaluate(student);
    }
}
class Teacher{
    private String name;
    private String lesson;

    public Teacher(String name, String lesson) {
        this.name = name;
        this.lesson = lesson;
    }
    public void evaluate(Student student){
        Random random = new Random();
        int grade = random.nextInt(2,6);
        String grade1 = null;
        switch (grade){
            case 2 -> grade1 = "неудовлетворительно";
            case 3 -> grade1 = "удовлетворительно";
            case 4 -> grade1 = "хорошо";
            case 5 -> grade1 = "отлично";
        }
        System.out.println("Преподователь "+name+" оценил студента с именем "+student.getName()+
                " по предмету "+lesson+" на оценку "+grade1);
    }
}
class Student{
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}