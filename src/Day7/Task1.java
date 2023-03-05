package Day7;

public class Task1 {
    /**
     * 1. Для этого задания скопируйте класс Самолет из предыдущего дня в пакет текущего
     * дня.
     * В классе Самолет создать статический метод compareAirplanes, который в
     * качестве аргументов принимает два объекта класса Airplane (два самолета) и выводит
     * сообщение в консоль о том, какой из самолетов длиннее.
     */
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boeing 777",1990,64,139225);
        Airplane airplane2 = new Airplane("Boeing 747",1968,71,183500);
        Airplane.compareAirplanes(airplane1,airplane2);
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
    public static void compareAirplanes(Airplane airplane, Airplane airplane2){
        if(airplane.length>airplane2.length){
            System.out.println("Длина самолета "+airplane.producer+" больше на "+(airplane.length-airplane2.length)+"см");
        }else {
            System.out.println("Длина самолета "+airplane2.producer+" больше на "+(airplane2.length-airplane.length)+"см");
        }
    }
}
