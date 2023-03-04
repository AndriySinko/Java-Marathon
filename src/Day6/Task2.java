package Day6;

public class Task2 {
    /**
     * 2. Создать класс Самолет (Airplane) с полями:
     * - producer (изготовитель)
     * - year (год выпуска)
     * - length (длина)
     * - weight (вес)
     * - fuel (количество топлива в баке) + геттер для этого поля
     *
     * Создать конструктор в классе Самолет, принимающий в качестве аргументов значения
     * четырех полей класса (значение поля “количество топлива в баке” установить равным 0).
     * В конструкторе для передачи полям значений использовать ключевое слово this.
     *
     * Помимо этого, в классе необходимо реализовать метод info(), который выводит
     * сообщение в следующем формате:
     * “Изготовитель: … , год выпуска: … , длина: ..., вес: ..., количество топлива в баке: …”
     *
     * Также, необходимо реализовать метод fillUp(), который в качестве аргумента
     * принимает число и заправляет топливный бак самолета на это значение.
     *
     * Создать новый объект класса Самолет с произвольными данными.
     * Изменить год выпуска и длину с помощью сеттеров, вызвать метод fillUp() два
     * раза, передав разные значения. Вызвать метод info().
     */
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing",1990,64,347450);
        airplane.info();
        System.out.println();
        airplane.setLength(71);
        airplane.setYear(1968);
        airplane.fillUp(6000);
        airplane.info();
    }
}
class Airplane{
    private String producer;
    private int year;
    private int length;
    private int weight;
    private  int fuel;
    public Airplane(String producer, int year, int length, int weight){
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void info(){
        System.out.println("Изготовитель: "+producer+"\nГод выпуска: "+year+"\nДлина: "+length+"\nВес: "+weight+
                "\nКоличество топлива в баке: "+fuel);
    }
    public void fillUp(int fuel){
        this.fuel = fuel;
    }
}