package Day8;

public class Task2 {
    /**
     * 2. Скопируйте класс Самолет из задания дня 6.
     * Внесите изменения в класс таким образом, чтобы следующий код выводил
     * информацию о самолете, аналогично вызову метода info().
     * Airplane airplane = new Airplane ("Boeing", 2000, 150, 10000);
     * System.out.println(airplane)
     */
    public static void main(String[] args) {
       Airplane airplane = new Airplane("Boeing",1990,64,347450);
       airplane.info();
        System.out.println("\n"+airplane);
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

    @Override
    public String toString() {
        return "Изготовитель: "+producer+"\nГод выпуска: "+year+"\nДлина: "+length+"\nВес: "+weight+
                "\nКоличество топлива в баке: "+fuel;
    }
}